package com.zcc.demo.kotlin.module.main.domain

import com.zcc.demo.kotlin.module.DumyData
import com.zcc.demo.kotlin.module.base.Command

class TestCommand : Command<DumyData> {

    override fun execute(): DumyData {
        return DumyData()
    }

}