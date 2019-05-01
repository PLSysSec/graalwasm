#!/usr/bin/env bash

COMPONENT_DIR="component_temp_dir"
LANGUAGE_PATH="$COMPONENT_DIR/jre/languages/wasm"
if [[ -f ../native/wasmnative ]]; then
    INCLUDE_WASMNATIVE="TRUE"
fi

rm -rf COMPONENT_DIR

mkdir -p "$LANGUAGE_PATH"
cp ../language/target/wasmlanguage.jar "$LANGUAGE_PATH"

mkdir -p "$LANGUAGE_PATH/launcher"
cp ../launcher/target/wasm-launcher.jar "$LANGUAGE_PATH/launcher/"

mkdir -p "$LANGUAGE_PATH/bin"
cp ../wasm $LANGUAGE_PATH/bin/
if [[ $INCLUDE_WASMNATIVE = "TRUE" ]]; then
    cp ../native/wasmnative $LANGUAGE_PATH/bin/
fi

mkdir -p "$COMPONENT_DIR/META-INF"
{
    echo "Bundle-Name: Wasm Language";
    echo "Bundle-Symbolic-Name: com.oracle.truffle.wasm";
    echo "Bundle-Version: 1.0.0-rc16";
    echo 'Bundle-RequireCapability: org.graalvm; filter:="(&(graalvm_version=1.0.0-rc16)(os_arch=amd64))"';
    echo "x-GraalVM-Polyglot-Part: True"
} > "$COMPONENT_DIR/META-INF/MANIFEST.MF"

(
cd $COMPONENT_DIR || exit 1
jar cfm ../wasm-component.jar META-INF/MANIFEST.MF .

echo "bin/wasm = ../jre/languages/wasm/bin/wasm" > META-INF/symlinks
if [[ $INCLUDE_WASMNATIVE = "TRUE" ]]; then
    echo "bin/wasmnative = ../jre/languages/wasm/bin/wasmnative" >> META-INF/symlinks
fi
jar uf ../wasm-component.jar META-INF/symlinks

{
    echo "jre/languages/wasm/bin/wasm = rwxrwxr-x"
    echo "jre/languages/wasm/bin/wasmnative = rwxrwxr-x"
} > META-INF/permissions
jar uf ../wasm-component.jar META-INF/permissions
)
rm -rf $COMPONENT_DIR
