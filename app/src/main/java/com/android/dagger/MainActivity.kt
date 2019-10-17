package com.android.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.dagger.data.Computer
import com.android.dagger.di.App
import com.android.dagger.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var computer:Computer
    lateinit var textView: TextView
    @Inject lateinit var greeting:String
    @Inject lateinit var date:Integer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        (application as App).component.getSubComponent().getNumber(12).build().inject(this)
        computer.turnOn()
        textView.text = date.toString()

    }
}
