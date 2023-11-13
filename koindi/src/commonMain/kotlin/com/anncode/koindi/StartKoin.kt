package com.anncode.koindi

import com.anncode.data.di.dataModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            dataModule()
        )
    }


// helper function to call koin from swift code
fun initKoin() = initKoin {  }
