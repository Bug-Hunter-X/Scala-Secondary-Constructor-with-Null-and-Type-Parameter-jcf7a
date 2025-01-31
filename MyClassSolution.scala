```scala
class MyClass[T](val value: Option[T]) {
  def this() = this(None)
  def this(value: T) = this(Some(value))
}
```