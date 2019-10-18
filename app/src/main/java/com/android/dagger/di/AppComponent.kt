package com.android.dagger.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Component(modules = [ AndroidInjectionModule::class, ActivityModule::class])
@Singleton
interface AppComponent {
    fun inject(app: App)


    @Component.Builder
    interface Builder {
        fun build() : AppComponent

    }


}