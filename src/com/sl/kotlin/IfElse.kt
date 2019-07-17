package com.sl.kotlin

fun main(){
    val timeMillis = System.currentTimeMillis().toInt()
    if (timeMillis%2==0){
        println("${timeMillis} 是偶数")
    }else if (timeMillis%5==0){
        print("${timeMillis} 能被5整除")
    }else{
        print("${timeMillis} 是个基数")
    }
}