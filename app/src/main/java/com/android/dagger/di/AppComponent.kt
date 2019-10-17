package com.android.dagger.di

import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun inject(app: App)

    fun getSubComponent() : ActivitySubComponent.Builder
    @Component.Builder
    interface Builder {
        fun build() : AppComponent

    }


}