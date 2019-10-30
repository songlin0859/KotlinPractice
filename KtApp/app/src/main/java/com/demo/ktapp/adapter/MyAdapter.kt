package com.demo.ktapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.demo.ktapp.R
import com.demo.ktapp.net.ArticleBean

/**
 * MyAdapter
 *
 * @author differ
 * @date 2019-10-30
 */
class MyAdapter(private val list: List<ArticleBean>) : RecyclerView.Adapter<MyAdapter.VH>() {

    var onItemClick: OnItemClick? = null

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VH {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_article, p0, false)
        return VH(view,onItemClick)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(vh: VH, p1: Int) {
        val articleBean = list[p1]
        with(vh){
            id.text = "${articleBean.id}"
            name.text = articleBean.name
        }
    }

    class VH(itemView: View,onItemClick: OnItemClick?) : RecyclerView.ViewHolder(itemView) {
        val name:TextView = itemView.findViewById(R.id.name)
        val id:TextView = itemView.findViewById(R.id.id)

        init {
            itemView.setOnClickListener { onItemClick?.onItemClick(adapterPosition) }
        }
    }
}

interface OnItemClick {
    fun onItemClick(position: Int)
}
