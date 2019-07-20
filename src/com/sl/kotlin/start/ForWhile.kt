package com.sl.kotlin.start

fun main(){
    for (i in 0..10){
        print("  $i")
    }
    println()

    val items = listOf<String>("Luo","Yu","Ting")
    for (item in items){
        print("  $item")
    }
    println()

    var i=0
    do {
        println("$i is ${items[i]}")
        i++
    }while (i<items.size)

    while (i>0){
        println("$i is ${items[--i]}")
    }
}