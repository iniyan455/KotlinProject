package kt.abstraction

/*
An kt.abstract class cannot be instantiated, which means we cannot create the object of an kt.abstract class.
 Unlike other class, an kt.abstract class is always open so we do not need to use the open keyword.

Points to Note:
1. We cannot create the object of an kt.abstract class.
2. Property and member function of an kt.abstract class are by default non-kt.abstract.
If you want to override these in the child class then you need to use open keyword for them.
3. If a member function is kt.abstract then it must be implemented in the child class.
 An kt.abstract member function doesn’t have a body only method signature, the implementation is done in the child class.
 */

/*
Abstract classes are by default open. So adding an open modifier to allow subclassing isn’t required.
 */

 abstract class Student(name :String , age :Int) {
    init {
        println("name is $name")
        println("age is $age")
    }

    fun demo() {
        println("non kt.abstract method")
    }

    abstract fun func(message : String)
}


class College(name: String,age: Int)  : Student(name, age){
    override fun func(message: String) {
        println("override college func method ")
    }

}

fun main() {
    val obj = College("iniyan", 24)
    obj.func("hi iniyan")
    obj.demo()
}