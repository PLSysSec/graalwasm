#!/usr/bin/env bash
if [[ $WASM_BUILD_NATIVE == "false" ]]; then
    echo "Skipping the native image build because WASM_BUILD_NATIVE is set to false."
    exit 0
fi
"$JAVA_HOME"/bin/native-image --tool:truffle -H:MaxRuntimeCompileMethods=1200 \
    -cp ../language/target/wasmlanguage.jar:../launcher/target/launcher-1.0.0-rc16-SNAPSHOT.jar \
    com.oracle.truffle.wasm.launcher.WasmMain \
    wasmnative
