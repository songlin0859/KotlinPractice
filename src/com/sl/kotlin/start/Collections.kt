package com.sl.kotlin.start

fun main() {
    val list= listOf<String>("1","2","3")
    println("${list.get(0)},${list[1]},${list[2]}")
    //cannot add list不可变
    //list.add
    list.forEach {
        print("--$it")
    }

    list.forEach {item->
        print("--$item")
    }

    println()
    val arrayList= mutableListOf<String>("1")
    for (i in 2..15){
        arrayList.add(i.toString())
    }
    arrayList.forEach{item->
        print("-$item")
        print("-$item")
    }

}