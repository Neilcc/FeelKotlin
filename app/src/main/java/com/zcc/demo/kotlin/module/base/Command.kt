package com.zcc.demo.kotlin.module.base

public interface Command<T> {
    fun execute(): T
}