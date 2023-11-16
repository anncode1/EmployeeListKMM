package com.anncode.koindi

import com.anncode.data.di.dataModule
import com.anncode.domain.di.useCaseModule
import com.anncode.employeelistkmm.di.presentationModule
import org.koin.core.Koin
import org.koin.core.context.startKoin

/*object KoinHelper {

    lateinit var koinApp: Koin
    fun startKoin() {
        koinApp = startKoin {
            modules(
                dataModule(),
                useCaseModule(),
                presentationModule(),
            )
        }.koin
    }

    fun getEmployeesViewModel(): EmployeesViewModel {
        return koinApp.get<EmployeesViewModel>()
    }
}*/

fun startK(): Koin {

    val koinApp = startKoin {
        modules(
            dataModule(),
            useCaseModule(),
            presentationModule(),
        )
    }.koin

    return koinApp
    //koinApp.get<EmployeesViewModel>()
}

/*object KoinHelper2 : KoinComponent {

    fun getEmployeesViewModel() = KoinHelper().koinApp.get<EmployeesViewModel>()
}*/

