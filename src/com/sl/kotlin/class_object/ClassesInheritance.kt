package com.sl.kotlin.class_object

class People{

}

class Empty

//class Person constructor(var name:String){
//
//}

//class Person(var name:String){
//
//}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}


fun main() {
    //InitOrderDemo("Lin")
    Constructors(1)
}