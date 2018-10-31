package com.zcc.demo.kotlin.module

import android.content.Context
import android.widget.Toast

public fun Context.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
}

