package com.android.dagger.di

import com.android.dagger.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivitySubComponent {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun getNumber(@Named("bound")date:Int) : Builder
        fun build() : ActivitySubComponent
    }
    fun inject(activity:MainActivity)
}