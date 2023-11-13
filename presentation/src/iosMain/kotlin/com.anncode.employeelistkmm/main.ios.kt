package com.anncode.employeelistkmm

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    //App()
    iOSUI()

}

@Composable
fun iOSUI() {
    Column {
        Text("Brett Stiedemann")
        Text("Deron Wintheiser")
        Text("Aubrey Schowalter")
        Text("Mia Dietrich")
        Text("Orland Cronin")
        Text("Mathilde Zulauf")
    }

}