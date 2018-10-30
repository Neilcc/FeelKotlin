package com.zcc.demo.kotlin.module

class DumyData {
    var name: String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "Name: $value"
        }

    var nameT: String = ""
        get() = field.toLowerCase()
        set(value) {
            field = "NameT : $value"
        }
}