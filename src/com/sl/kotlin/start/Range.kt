package com.sl.kotlin.start

fun main(){
    for (i in 1..10){
        print(" $i")
    }

    println()
    for (i in 1..10 step 2){
        print(" $i")
    }

    println()
    for (i in 1..10 step 3){
        print(" $i")
    }
}