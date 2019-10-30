package com.demo.ktapp.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * NetHelper
 *
 * @author differ
 * @date 2019-10-30
 */

private val retrofit =Retrofit.Builder()
    .baseUrl("https://www.wanandroid.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

private fun <T> getService(clz:Class<T>):T{
    return retrofit.create(clz)
}

/**
 * 获取WanAndroidService
 */
fun getWanService():WanAndroidService{
    return getService(WanAndroidService::class.java)
}