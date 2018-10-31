package com.zcc.demo.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.zcc.demo.kotlin.module.main.data.JsonData
import com.zcc.demo.kotlin.module.toast

class ActivityTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("hh?")
        val aa: String = "{}"
        Gson().fromJson(aa, JsonData::class.java)
    }
}