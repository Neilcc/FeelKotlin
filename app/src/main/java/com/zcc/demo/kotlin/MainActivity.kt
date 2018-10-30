package com.zcc.demo.kotlin

import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zcc.demo.kotlin.module.DumyData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mItems = listOf(
            "a", "b", "c", "d", "e", "e"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_message.text = "mesage of kotlin"
        niceToast("hi")
        rv_main_list.layoutManager = LinearLayoutManager(this)
        rv_main_list.adapter = MyAdapter(mItems, this)
        val dumyData: DumyData = DumyData();
        dumyData.name = "ADADadad"
        dumyData.nameT="ADADadad"
        niceToast(dumyData.nameT)
    }

    fun niceToast(message: String, className: String = "wtf???",
                  length: Int = Toast.LENGTH_LONG): Unit {
        Toast.makeText(this, "[$className] $message", length).show();
    }

    class MyAdapter(val items: List<String>, context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
        var context: Context = context

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(TextView(parent.context))
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(items[position])
        }


        class ViewHolder(itemView: TextView) : RecyclerView.ViewHolder(itemView) {
            fun bind(s: String) {
                (itemView as TextView).text = s
            }

        }

    }
}
