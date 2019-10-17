package com.android.dagger.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @JvmStatic
    @Provides
    @Singleton
    fun getName() : String {
        return "Hello there!"
    }
}