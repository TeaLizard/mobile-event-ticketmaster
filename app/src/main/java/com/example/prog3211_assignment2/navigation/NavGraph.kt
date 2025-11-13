package com.example.prog3211_assignment2.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.prog3211_assignment2.feature.EventDetails
import com.example.prog3211_assignment2.feature.EventList
import com.example.prog3211_assignment2.ui.model.EventsViewModel

@Composable
fun NavGraph(navController: NavHostController, innerPadding: PaddingValues) {
    val padding = PaddingValues(16.dp)
    val viewModel: EventsViewModel = viewModel()

    NavHost(navController = navController, startDestination = "list") {
        // Standard navigation graph
        // The two composables share a view model so an event does not have to be passed
        // as it is set in the model instead
        composable("list") {
            EventList(padding, navController, viewModel)
        }
        composable("event") {
            EventDetails(padding, navController, viewModel)
        }
    }
}