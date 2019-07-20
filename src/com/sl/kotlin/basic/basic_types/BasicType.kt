package com.sl.kotlin.basic.basic_types

fun main(){
    /*-----------------Numbers-----------------*/
    /*
    Double 	64
    Float 	32
    Long 	64
    Int 	32
    Short 	16
    Byte 	8
     */

    /*
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

    /*
    shl(bits) – signed shift left (Java's <<)
    shr(bits) – signed shift right (Java's >>)
    ushr(bits) – unsigned shift right (Java's >>>)
    and(bits) – bitwise and
    or(bits) – bitwise or
    xor(bits) – bitwise xor
    inv() – bitwise inversion
     */

    var intA:Int=12
    var longA:Long=12L
    var floatA:Float=12.0F
    var doubleA:Double=12.0

    //println( "intA==longA=${intA==longA}")
    check('s')

    val array= Array<String>(16,
        {it.toString()}
    ).also {
        it.forEach {
            item->
            println(item)
        }
    }
}

fun check(c:Char){
    println(" char is $c")
}