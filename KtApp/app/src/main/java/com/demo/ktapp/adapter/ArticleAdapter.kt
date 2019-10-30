package com.demo.ktapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.demo.ktapp.R
import com.demo.ktapp.net.ArticleBean

/**
 *
 *
 * @author differ
 * @date 2019-10-30
 */

class ArticleAdapter(val list: List<ArticleBean>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val  view = LayoutInflater.from(parent?.context).inflate(R.layout.item_article,parent,false)
        val textView: TextView = view.findViewById(R.id.name)
        val articleBean = list[position]
        textView.text = articleBean.name
        return view
    }

    override fun getItem(position: Int): ArticleBean {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

}