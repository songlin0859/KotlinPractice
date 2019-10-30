package com.demo.ktapp.util

import android.content.Context
import android.widget.Toast

/**
 * ContextExtends
 *
 * @author differ
 * @date 2019-10-30
 */

fun Context.toast(msg:String) {
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
}