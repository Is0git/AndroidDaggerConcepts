package com.android.dagger.di

import android.app.Application
import com.android.dagger.data.Computer
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import java.util.*
import javax.inject.Inject

class App : Application(), HasAndroidInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

    @Inject lateinit var computer:Computer
    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)

//        computer.turnOn()
    }
}