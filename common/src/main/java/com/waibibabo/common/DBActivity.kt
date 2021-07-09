package com.waibibabo.common

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity

/**
 * @author  hehb
 * @date  2021/7/8 18:59
 */
abstract class DBActivity : AppCompatActivity() {

    @CallSuper
    protected open fun preInit() {
        println("DBActivity.preInit")
    }

    protected abstract fun init()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        preInit()
        init()
    }
}