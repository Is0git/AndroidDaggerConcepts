package com.android.dagger.di

import android.app.Application
import com.android.dagger.data.Computer
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class App : Application() {

    @Inject lateinit var computer:Computer
    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().build().also { component = it }.inject(this)

//        computer.turnOn()
    }
}