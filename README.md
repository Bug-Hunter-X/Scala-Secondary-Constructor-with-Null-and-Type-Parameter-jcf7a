# Scala Secondary Constructor with Null and Type Parameter

This example demonstrates a common error in Scala when using secondary constructors with type parameters and attempting to provide a default value of null.  The problem arises when attempting to cast null to a non-nullable type parameter.

## Bug

The `MyClass` class has a primary constructor and a secondary constructor. The secondary constructor attempts to assign null to the type parameter T which can cause runtime exceptions. If `T` is `Int`, it will throw an exception at runtime.

## Solution

The solution avoids casting null to a non-nullable type parameter, instead using an Option[T] to represent the potentially null value.