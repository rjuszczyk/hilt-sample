package com.rjuszczyk.myhilttestapplication

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

//@Module
//@InstallIn(ActivityComponent::class)
//abstract class AaaActivityModule {
//    @Binds
//    abstract fun someInterface(activity: AaaActivity): SomeInterface
//}

@Module
@InstallIn(ActivityComponent::class)
class AaaActivityModule {
    @Provides
     fun someInterface(): SomeInterface {
         return object: SomeInterface {
             override fun someMethod() {

             }
         }
     }
}