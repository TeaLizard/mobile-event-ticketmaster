package com.example.prog3211_assignment2.feature

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prog3211_assignment2.R
import com.example.prog3211_assignment2.ui.model.EventsViewModel
import java.text.NumberFormat

@Composable
fun EventDetails(padding: PaddingValues, navController: NavController, viewModel: EventsViewModel) {
    // Details for selected event
    // No hardcoded strings
    val event = viewModel.selectedEvent ?: return
    // Event selected from EventList

    Surface(
        // Screen exists on a surface for a nice visual effect
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface,
        shadowElevation = 4.dp,
        tonalElevation = 6.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Card(
                // Card for image
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                shape = MaterialTheme.shapes.extraLarge,
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                )
            ) {
                Image(
                    painter = painterResource(id = event.image),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            // List of event details
            Text(event.name, style = MaterialTheme.typography.headlineLarge)
            Text(event.category)
            Text(event.date)
            Text(event.time)
            Text(event.location)
            Text(event.description)
            Spacer(modifier = Modifier.padding(4.dp))

            // Ticket price
            Text(stringResource(R.string.ticket_price_header))
            val price = NumberFormat.getCurrencyInstance().format(event.price)
            Text(price)

            Row(
                // Row for buy and back buttons
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(onClick = {}) {
                    // Unimplemented buy button
                    Text(stringResource(R.string.buy_button))
                }
                Button(onClick = { navController.popBackStack() }) {
                    // Back button uses popBackStack() to avoid a growing call stack
                    Text(stringResource(R.string.back_button))
                }
            }
        }
    }
}