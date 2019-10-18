package com.android.dagger.di

import android.app.Activity
import com.android.dagger.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindUserActivity(subcomponent: ActivitySubComponent.Factory) : AndroidInjector.Factory<out Any>


}