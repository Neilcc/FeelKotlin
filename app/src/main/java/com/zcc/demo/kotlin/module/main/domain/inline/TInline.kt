package com.zcc.demo.kotlin.module.main.domain.inline


inline fun tinline(params: (Int) -> Unit) {
    val k = 6
    params(k)
}

class TInline {
    fun test() {

        tinline(
                { iii ->
                    {
                        ef()
                    }
                }
        )

        tinline({
            it + 1;
            ef()
        })

        tinline(params = {
            var ii = it + 1;
            ef()
        })

        tinline {
            var iii = it + 1;
            ef()
        }

    }

    fun ef(){

    }

}