package com.demo.ktapp.net

import retrofit2.Call
import retrofit2.http.GET

/**
 * WanAndroidService
 *
 * @author differ
 * @date 2019-10-30
 */
interface WanAndroidService {
    /**
     * 获取公众号列表
     */
    @GET("wxarticle/chapters/json")
    fun wxarticle(): Call<DataWrapper<List<ArticleBean>>>
}
