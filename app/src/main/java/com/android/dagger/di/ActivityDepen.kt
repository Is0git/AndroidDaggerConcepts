package com.android.dagger.di

import com.android.dagger.data.Box
import com.android.dagger.data.Monitor
import com.android.dagger.data.MySecondComputer
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object ActivityDepen {
    @Provides
    @ActivityScope
    @JvmStatic
    fun getDate(@Named("bound")number:Int) : Int {
        return number
    }

    @Provides
    @ActivityScope
    @JvmStatic
    fun getPc(box: Box, monitor: Monitor) = MySecondComputer(monitor, box)
}