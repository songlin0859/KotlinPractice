package com.sl.kotlin.start

fun main() {
//    val a:Any=3
    val a:Any="Lin"
    when(a){
        3->{
            println("a is $a")
        }
        4->{
            println("a is $a")
        }
        "Lin"->{
            println("a is $a")
        }
        is Int->{

        }

        !is String->{}
    }
}
