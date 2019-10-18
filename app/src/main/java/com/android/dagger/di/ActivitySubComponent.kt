package com.android.dagger.di

import com.android.dagger.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivitySubComponent {

    @Subcomponent.Factory
    interface Builder {

        fun create(@BindsInstance @Named("bound") value:Int) : ActivitySubComponent
    }
    fun inject(activity:MainActivity)
}