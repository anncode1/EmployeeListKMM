package com.anncode.employeelistkmm

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anncode.employeelistkmm.employees.EmployeesScreen
import com.anncode.employeelistkmm.ui.theme.EmployeeTheme

@Composable
fun App() {
    EmployeeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            EmployeesScreen()
        }
    }
}
