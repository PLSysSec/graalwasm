/*
 * Copyright (c) 2012, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.wasm.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.wasm.WasmLanguage;
import com.oracle.truffle.wasm.parser.WasmLanguageParser;

/**
 * Manages the mapping from function names to {@link WasmFunction function objects}.
 */
public final class WasmFunctionRegistry {

    private final WasmLanguage language;
    private final FunctionsObject functionsObject = new FunctionsObject();
    private final Map<String, Integer> indices = new HashMap<>();

    public WasmFunctionRegistry(WasmLanguage language) {
        this.language = language;
    }

    /**
     * Returns the canonical {@link WasmFunction} object for the given name. If it does not exist yet,
     * it is created.
     */
    public WasmFunction lookup(String name, Integer index, boolean createIfNotPresent) {
        if (index == null) {
            index = getIndex(name);
        }

        WasmFunction result = null;

        if (index != null) {
            result = getFunction(index); // check if function already exists
        }

        if (result == null && createIfNotPresent) {
            result = new WasmFunction(language, name, index);
            functionsObject.putMember(index, result);
            if (index != null && name != null) mapStringToIndex(name, index);
        }
        return result;
    }

    /**
     * Associates the {@link WasmFunction} with the given name with the given implementation root
     * node. If the function did not exist before, it defines the function. If the function existed
     * before, it redefines the function and the old implementation is discarded.
     */
    public WasmFunction register(String name, Integer index, RootCallTarget callTarget) {
        WasmFunction function = lookup(name, index, true);
        function.setCallTarget(callTarget);
        return function;
    }

    public void register(Map<Integer, RootCallTarget> newFunctions) {
        for (Map.Entry<Integer, RootCallTarget> entry : newFunctions.entrySet()) {
            register(entry.getValue().getRootNode().getName(), entry.getKey(), entry.getValue()); // TODO any situations where this getName() might not work properly?
        }
    }

    public void register(Source newFunctions) {
        register(WasmLanguageParser.parseWasm(language, newFunctions));
    }

    private void mapStringToIndex(String name, Integer index) {
        indices.put(name, index);
    }

    private Integer getIndex(String name) {
        return indices.get(name);
    }

    private WasmFunction getFunction(Integer index) {
        return functionsObject.getMember(index);
    }

    /**
     * Returns the sorted list of all functions, for printing purposes only.
     */
    public List<WasmFunction> getFunctions() {
        List<WasmFunction> result = new ArrayList<>(functionsObject.getMapping().values());
        Collections.sort(result, new Comparator<WasmFunction>() {
            public int compare(WasmFunction f1, WasmFunction f2) {
                return f1.toString().compareTo(f2.toString());
            }
        });
        return result;
    }

    public TruffleObject getFunctionsObject() {
        return functionsObject;
    }

}
