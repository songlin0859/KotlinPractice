package com.demo.ktapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.demo.ktapp.adapter.MyAdapter
import com.demo.ktapp.adapter.OnItemClick
import com.demo.ktapp.net.ArticleBean
import com.demo.ktapp.net.DataWrapper
import com.demo.ktapp.net.getWanService
import com.demo.ktapp.util.toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //private lateinit var listView: ListView
    //listView=findViewById(R.id.listView)
    private lateinit var mList: MutableList<ArticleBean>
    //private lateinit var mAdapter: ArticleAdapter
    private lateinit var mAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList = mutableListOf()
        mAdapter = MyAdapter(mList)
        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
        recyclerView.adapter = mAdapter
        mAdapter.onItemClick = object : OnItemClick {
            override fun onItemClick(position: Int) {
                val articleBean = mList[position]
                toast(articleBean.name ?: "")
            }
        }
        //加载数据
        loadArticles()
    }

    private fun loadArticles() {
        toast("开始加载数据")
        getWanService().wxarticle().enqueue(object : Callback<DataWrapper<List<ArticleBean>>> {
            override fun onResponse(
                call: Call<DataWrapper<List<ArticleBean>>>,
                response: Response<DataWrapper<List<ArticleBean>>>
            ) {
                if (response.isSuccessful) {
                    val data = response.body()?.data
                    data?.let {
                        mList.clear()
                        mList.addAll(data)
                        mAdapter.notifyDataSetChanged()
                        toast("加载成功")
                    }
                } else {
                    toast("isSuccessful is false")
                }
            }

            override fun onFailure(call: Call<DataWrapper<List<ArticleBean>>>, t: Throwable) {
                toast(t.message ?: "")
            }

        })
    }
}
