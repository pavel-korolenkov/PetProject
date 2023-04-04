package ru.korpa.petproject

import android.app.Application
import ru.korpa.petproject.di.DaggerPPComponent
import ru.korpa.petproject.di.PPComponent

class App : Application() {

    lateinit var component: PPComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerPPComponent.create()
    }
}