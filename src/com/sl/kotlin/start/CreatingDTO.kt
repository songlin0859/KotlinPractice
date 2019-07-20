package com.sl.kotlin.start

data class UserDTO(var name:String ,var age:Int)

fun main(){
    val user= UserDTO("Lin", 28)
    println(user)
}