package com.oracle.truffle.wasm.runtime;

import com.oracle.truffle.api.*;
import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.IndirectCallNode;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.utilities.CyclicAssumption;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.nodes.WasmExpressionNode;
import com.oracle.truffle.wasm.nodes.WasmUndefinedFunctionRootNode;

import java.lang.Long;
import java.lang.Integer;

/**
 * Represents a Wasm function. On the Truffle level, a callable element is represented by a
 * {@link RootCallTarget call target}. This class encapsulates a call target, and adds version
 * support: functions in Wasm can be redefined, i.e. changed at run time. When a function is
 * redefined, the call target managed by this function object is changed (and {@link #callTarget} is
 * therefore not a final field).
 * <p>
 * Function redefinition is expected to be rare, therefore optimized call nodes want to speculate
 * that the call target is stable. This is possible with the help of a Truffle {@link Assumption}: a
 * call node can keep the call target returned by {@link #getCallTarget()} cached until the
 * assumption returned by {@link #getCallTargetStable()} is valid.
 * <p>
 * The {@link #callTarget} can be {@code null}. To ensure that only one {@link WasmFunction} instance
 * per name exists, the {@link WasmFunctionRegistry} creates an instance also when performing name
 * lookup. A function that has been looked up, i.e., used, but not defined, has a call target that
 * encapsulates a {@link WasmUndefinedFunctionRootNode}.
 */
@ExportLibrary(InteropLibrary.class)
public final class WasmGlobal implements TruffleObject {

    //public static final int INLINE_CACHE_SIZE = 2;

    //private static final TruffleLogger LOG = TruffleLogger.getLogger(WasmLanguage.ID, WasmGlobal.class);

    /** The name of the global. */
    private final String name;

    /** The index of the global. */
    private Integer index;

    /** The current value of this global. */
    private WasmExpressionNode value;

    /** Mutability */
    private boolean mutable;

    protected WasmGlobal(String name, Integer index, WasmExpressionNode value, boolean mutable) {
        this.name = name;
        this.index = index;
        this.value = value;
        this.mutable = mutable;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index.intValue();
    }

    protected void setValue(WasmExpressionNode value) {
        if (mutable) this.value = value;
        else throw new RuntimeException("invalid module: global is immutable");
    }

    public WasmExpressionNode getValue() {
        return value;
    }

    /**
     * This method is, e.g., called when using a function literal in a string concatenation. So
     * changing it has an effect on Wasm programs.
     */
    @Override
    public String toString() {
        try {
            return Integer.toString(value.executeInt(null)); // TODO handle for other types too
        } catch (UnexpectedResultException e) {
            System.out.println("unexpected result: could not evaluate/get value of global " + name + " as a string");
        }
        return name;
    }

    /**
     * {@link WasmFunction} instances are always visible as executable to other languages.
     */
    //@SuppressWarnings("static-method")
    public SourceSection getDeclaredLocation() {
        return getValue().getSourceSection();
    }
}
