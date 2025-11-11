package com.example.prog3211_assignment2.ui.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.prog3211_assignment2.model.Event


class EventsViewModel : ViewModel() {
    val events = com.example.prog3211_assignment2.model.events
    val categories = listOf(
        "Music",
        "Sports",
        "Workshop",
        "Exhibition"
    )
    val locations = listOf(
        "All",
        "Toronto",
        "Vancouver",
        "Montreal"
    )

    var selectedEvent by mutableStateOf<Event?>(null)
        private set

    var selectedCategories by mutableStateOf(setOf<String>())
        private set

    var isLocationDropdownExpanded by mutableStateOf(false)
        private set
    var selectedLocation by mutableStateOf(locations.first())
        private set

    fun selectEvent(event: Event) {
        selectedEvent = event
    }

    fun updateCategories(category: String) {
        selectedCategories = if (category in selectedCategories) {
            selectedCategories - category
        } else {
            selectedCategories + category
        }
    }

    fun toggleLocationDropdown(expanded: Boolean) {
        isLocationDropdownExpanded = expanded
    }
    fun updateLocation(location: String) {
        selectedLocation = location
        toggleLocationDropdown(false)
    }


    fun showEventCheck(event: Event): Boolean {
        if (event.category in selectedCategories
            && (selectedLocation == "All" || event.location == selectedLocation)) {
            return true
        }
        return false
    }
}