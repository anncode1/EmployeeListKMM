package com.anncode.employeelistkmm.android

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import com.anncode.koindi.initKoin

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class EmployeeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger(if (isDebug()) Level.ERROR else Level.NONE)
            androidContext(this@EmployeeApplication)
        }

        
    }
    private fun Context.isDebug() = 0 != applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE
}