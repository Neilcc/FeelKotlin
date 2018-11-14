package com.zcc.demo.kotlin.database

import android.database.sqlite.SQLiteDatabase

// func is a sqldb func
public fun <T> use(func: SQLiteDatabase.() -> T): T {
    try {
        return getDB()!!.func()
    } finally {
        getDB()!!.close()
    }
}

fun getDB(): SQLiteDatabase? {
    return null
}