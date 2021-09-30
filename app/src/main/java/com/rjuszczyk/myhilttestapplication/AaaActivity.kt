package com.rjuszczyk.myhilttestapplication

import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AaaActivity: AppCompatActivity() , SomeInterface {
//    @Inject
//    lateinit var someInterfaceConsumer: SomeInterfaceConsumer

    @Inject
    lateinit var someInterface: SomeInterface

    override fun someMethod() {

    }
}