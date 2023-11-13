package com.anncode.koindi

import com.anncode.data.di.dataModule
import com.anncode.domain.di.useCaseModule
import com.anncode.employeelistkmm.di.presentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            presentationModule(),
            useCaseModule(),
            dataModule(),
        )
    }


// helper function to call koin from swift code
fun initKoin() = initKoin {  }
