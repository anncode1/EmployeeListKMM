package com.anncode.employeelistkmm.employees

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.anncode.employeelistkmm.di.KotlinDependencies

@Composable
fun EmployeesScreen(
    viewModel: EmployeesViewModel = KotlinDependencies.getEmployeesViewModel()
) {

    val employees by viewModel.employeeState.collectAsState()

    if (employees.isNotEmpty()) {

        LazyColumn(
            state = rememberLazyListState()
        ) {
            items(employees) {
                Text(text = it.name)
            }
        }
    }

}