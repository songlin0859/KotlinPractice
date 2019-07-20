package com.sl.kotlin.start

fun main() {
    val people: People = Student()
    if (people is Student){
        //people 自动转换成Student类型
        println(people.desc())
    }
}

open class People{
    fun say(){
        println("people")
    }
}

class Student: People(){
    fun desc():String{
        return "student".toUpperCase()
    }
}