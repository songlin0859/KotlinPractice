package com.sl.kotlin

//函数格式  fun 函数名([参数名:参数类型,参数名:参数类型]):函数返回类型{函数体}
//可以 不需要分号 没有Return时 返回参数 Uint(可以省略)
/*fun sum(a:Int,b:Int):Int{
    return a+b
}*/

fun sum(a:Int,b:Int) = a+b

fun main() {
    val a:Int=12
    val b:Int=34
    val sum= sum(a,b)
    println("$a+$b=$sum")

    defalutParams("Lin")
    defalutParams("Lin",18)
}

/**
 * 默认参数
 */
fun defalutParams(name:String,age:Int=28):Unit{
    println("name:$name age:${age}")
}