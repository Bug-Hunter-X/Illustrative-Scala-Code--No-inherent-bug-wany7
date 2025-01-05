```scala
class MyClass(val x: Int) {
  def myMethod(): Int = {
    x + 1 // This will compile and run fine
  }
}

val obj = new MyClass(5)
obj.myMethod()
```