package com.example.prog3211_assignment2.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Surface
import com.example.prog3211_assignment2.R
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.prog3211_assignment2.ui.composable.EventCard
import com.example.prog3211_assignment2.ui.model.EventsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventList(padding: PaddingValues, navController: NavController, viewModel: EventsViewModel) {

    Column(
        modifier = Modifier.padding(padding).fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ExposedDropdownMenuBox(
            modifier = Modifier.fillMaxWidth(),
            expanded = viewModel.isLocationDropdownExpanded,
            onExpandedChange = { viewModel.toggleLocationDropdown(!viewModel.isLocationDropdownExpanded) }
        ) {
            TextField(
                value = viewModel.selectedLocation,
                onValueChange = {},
                readOnly = true,
                label = { Text(stringResource(R.string.location_header)) },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = viewModel.isLocationDropdownExpanded) },
                modifier = Modifier.menuAnchor(type = MenuAnchorType.PrimaryEditable, enabled = true)
                    .fillMaxWidth()
            )
            ExposedDropdownMenu(
                expanded = viewModel.isLocationDropdownExpanded,
                onDismissRequest = { viewModel.toggleLocationDropdown(false) }
            ) {
                viewModel.locations.forEach { location ->
                    DropdownMenuItem(
                        text = { Text(text = location) },
                        onClick = { viewModel.updateLocation(location) }
                    )
                }
            }
        }

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(viewModel.categories) { category ->
                FilterChip(
                    selected = category in viewModel.selectedCategories,
                    onClick = { viewModel.updateCategories(category) },
                    label = { Text(category) }
                )
            }
        }

        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.surface,
            shape = MaterialTheme.shapes.extraLarge,
            shadowElevation = 4.dp
        ) {
            LazyColumn(

            ) {
                items(viewModel.events) { event ->
                    if (viewModel.showEventCheck(event)) {
                        EventCard(event, viewModel, navController)
                    }
                }
            }
        }
    }
}