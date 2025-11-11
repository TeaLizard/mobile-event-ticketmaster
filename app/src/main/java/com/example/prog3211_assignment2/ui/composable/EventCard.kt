package com.example.prog3211_assignment2.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prog3211_assignment2.model.Event
import com.example.prog3211_assignment2.ui.model.EventsViewModel

@Composable
fun EventCard(event: Event, viewModel: EventsViewModel, navController: NavController) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp)
            .clickable {
                viewModel.selectEvent(event)
                navController.navigate("event")
            },
        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            contentColor = MaterialTheme.colorScheme.onSurfaceVariant
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(id = event.image),
                contentDescription = null,
                modifier = Modifier.weight(1f),

            )

            Column(modifier = Modifier.weight(2f)) {
                Text(text = event.name, style = MaterialTheme.typography.titleLarge)
                Text(text = event.category)
                Text(text = event.date)
                Text(text = event.time)
            }
        }
    }
}