package com.anncode.iosshared

import com.anncode.data.di.dataModule
import com.anncode.domain.di.useCaseModule
import com.anncode.employeelistkmm.di.presentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin() =
    startKoin {
        modules(
            useCaseModule(),
            dataModule(),
            presentationModule()
        )
    }


