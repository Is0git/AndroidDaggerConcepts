package com.android.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.dagger.data.Computer
import com.android.dagger.data.MySecondComputer
import com.android.dagger.di.App
import com.android.dagger.di.DaggerAppComponent
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Inject

class MainActivity : AppCompatActivity(){

    @Inject
    lateinit var computer:Computer
    lateinit var textView: TextView
    @Inject lateinit var greeting:String


    @Inject lateinit var second_computer:MySecondComputer
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)

        computer.turnOn()
        textView.text = greeting
        second_computer.turnOff()

    }
}
