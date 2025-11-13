package com.example.prog3211_assignment2.ui.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.prog3211_assignment2.model.Event


class EventsViewModel : ViewModel() {
    // ViewModel for EventList and EventDetails
    val events = com.example.prog3211_assignment2.model.events
    // listOf<Event>() seed events data
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
    // Event selected for EventDetails screen on click of an EventCard

    var selectedCategories by mutableStateOf(setOf<String>())
        private set
    // Selected set of categories

    var isLocationDropdownExpanded by mutableStateOf(false)
        private set
    // Boolean state of location dropdown
    var selectedLocation by mutableStateOf(locations.first())
        private set
    // String state of selected location


    fun selectEvent(event: Event) {
        selectedEvent = event
    }
    // Set selectedEvent to event on click of an EventCard


    fun updateCategories(category: String) {
        selectedCategories = if (category in selectedCategories) {
            selectedCategories - category
        } else {
            selectedCategories + category
        }
    }
    // Adds and removes categories from selectedCategories set on filter chip click

    fun toggleLocationDropdown(expanded: Boolean) {
        isLocationDropdownExpanded = expanded
    }
    // Toggles location dropdown
    fun updateLocation(location: String) {
        selectedLocation = location
        toggleLocationDropdown(false)
    }
    // Updates selectedLocation and hides location dropdown


    fun showEventCheck(event: Event): Boolean {
        if (event.category in selectedCategories
            && (selectedLocation == "All" || event.location == selectedLocation)) {
            return true
        }
        return false
    }
    // Used to query if an event should be shown on screen according to
    // selected categories and selected location
}