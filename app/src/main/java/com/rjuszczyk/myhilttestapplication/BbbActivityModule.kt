package com.rjuszczyk.myhilttestapplication

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

//@Module
//@InstallIn(ActivityComponent::class)
////abstract class BbbActivityModule {
////    @Binds
////    abstract fun someInterface(activity: BbbActivity): SomeInterface
////}
//class BbbActivityModule {
//    @Provides
//    fun someInterface(): SomeInterface {
//        return object: SomeInterface {
//            override fun someMethod() {
//                TODO("Not yet implemented")
//            }
//
//        }
//    }
//}