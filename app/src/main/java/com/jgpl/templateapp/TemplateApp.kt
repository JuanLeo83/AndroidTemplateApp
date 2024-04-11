package com.jgpl.templateapp

import android.app.Application
import com.jgpl.templateapp.di.dataModule
import com.jgpl.templateapp.di.domainModule
import com.jgpl.templateapp.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TemplateApp : Application() {

        override fun onCreate() {
            super.onCreate()

            startKoin {
                androidLogger()
                androidContext(this@TemplateApp)
                modules(
                    presentationModule,
                    domainModule,
                    dataModule
                )
            }
        }
}