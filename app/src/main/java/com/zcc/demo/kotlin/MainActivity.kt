package com.zcc.demo.kotlin

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zcc.demo.kotlin.module.DumyData
import com.zcc.demo.kotlin.module.main.data.MainData
import com.zcc.demo.kotlin.module.toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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
        val dumyData: DumyData = DumyData()
        dumyData.name = "ADADadad"
        dumyData.nameT = "ADADadad"
        niceToast(dumyData.nameT)
        toast("hh")
    }


    fun niceToast(message: String, className: String = "wtf???",
                  length: Int = Toast.LENGTH_LONG)  {
        Toast.makeText(this, "[$className] $message", length).show();
    }

    class MyAdapter(val items: List<String>, context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
        var context: Context = context

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(TextView(parent.context))
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(items, position)
        }

        class ViewHolder(itemView: TextView) : RecyclerView.ViewHolder(itemView) {

            fun bind(items: List<String>, position: Int) {
                with(items[position]) {
                    (itemView as TextView).text = this
                    itemView.setOnClickListener { itemView.context.toast("hh") }
                }
            }
        }

    }

    fun test() {
        val f1 = MainData("haha", 123)
        val f2 = f1.copy(age = 22)
        val f3 = f1.copy("aa")
        val f4 = f1.copy(name = "1122")

        val (name) = f1
        Log.d(name, name)

        val mapp = HashMap<Int, Int>()
        for ((key, value) in mapp) {
            Log.d(key.toString(), value.toString())
        }
        runOnUiThread {
            var name2 = "a"
        }

        GlobalScope.launch {
        }
    }
}
