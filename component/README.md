# The wasm language component for GraalVM

Truffle languages can be packaged as components which can be installed into
GraalVM using the [Graal
updater](http://www.graalvm.org/docs/reference-manual/graal-updater/). 
Running `mvn package` in the wasmlanguage folder also builds a
`wasm-component.jar`. 
This file is the wasm languages component for GraalVM and can be installed by
running:

```
/path/to/graalvm/bin/gu install /path/to/wasm-component.jar
```

