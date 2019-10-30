package com.demo.ktapp

import android.app.Application

/**
 * App
 *
 * @author differ
 * @date 2019-10-30
 */
class App : Application(){
    override fun onCreate() {
        super.onCreate()
        println("App start...")
    }
}