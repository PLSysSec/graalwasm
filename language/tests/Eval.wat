function main() {  
  eval("wasm", "function foo() { return 14 + 2; }");
  println(foo());
}
