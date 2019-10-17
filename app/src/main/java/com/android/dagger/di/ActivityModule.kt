package com.android.dagger.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object ActivityModule {
    @Provides
    @ActivityScope
    @JvmStatic
    fun getDate(@Named("bound")number:Int) : Int {
        return number
    }
}