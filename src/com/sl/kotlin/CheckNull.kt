package com.sl.kotlin;

fun main() {
    var user:User?=User("Lin",28)
    if (user==null){
        println("user is null")
    }

    println(user?.name)
    println(user?.age)
    user?.let {
        println("name:${it.name} age:${it.age}")
    }

    user?.run {
        println("name:${name} age:${age}")
    }

    user?.apply {
        name="CSL"
        age=18
        print("name:${name} age:${age}")
    }

    user?.also {
        print("name:${it.name} age:${it.age}")
    }

    with(user){
        println("name:${this?.name} age:${this?.age}")
    }
}

data class User(var name:String,var age:Int)
