package com.sl.kotlin.start

fun main() {
    var a=1
    val b=2
    var c:Int=3
    val d=12.34

//    Int
//    Long
//    Float
//    Double
    println("a=$a and type:${a.javaClass}")
    println("a=$b and type:${b.javaClass}")
    println("a=$c and type:${c.javaClass}")
    println("a=$d and type:${d.javaClass}")

    var  l:Long=1
    a=l.toInt()
    l=a.toLong()
    var f:Float=1.0f
    c=f.toInt()
    f=c.toFloat();
}