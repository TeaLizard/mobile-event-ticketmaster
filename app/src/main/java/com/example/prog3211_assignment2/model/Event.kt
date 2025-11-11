package com.example.prog3211_assignment2.model

import androidx.annotation.DrawableRes
import com.example.prog3211_assignment2.R

data class Event (
    val id: Int,
    val name: String,
    @DrawableRes val image: Int,
    val category: String,
    val date: String,
    val time: String,
    val location: String,
    val description: String,
    val price: Double
)

val events = listOf(
    Event(1, "Jazz Night", R.drawable.music, "Music", "2025-11-12", "19:00", "Toronto", "Smooth jazz evening with local artists.", 30.0),
    Event(7, "Basketball Showdown", R.drawable.sports, "Sports", "2025-11-13", "14:00", "Toronto", "Local teams compete in a thrilling tournament.", 20.0),
    Event(13, "Photography Masterclass", R.drawable.workshop, "Workshop", "2025-11-12", "10:00", "Toronto", "Learn advanced techniques from pros.", 60.0),
    Event(19, "Modern Art Expo", R.drawable.exhibition, "Exhibition", "2025-11-13", "12:00", "Toronto", "Explore contemporary artworks.", 15.0),
    Event(2, "Rock Revolution", R.drawable.music, "Music", "2025-11-14", "20:00", "Vancouver", "High-energy rock concert featuring indie bands.", 45.0),
    Event(8, "Vancouver Marathon", R.drawable.sports, "Sports", "2025-11-15", "08:00", "Vancouver", "Annual marathon through scenic routes.", 10.0),
    Event(14, "Creative Writing Bootcamp", R.drawable.workshop, "Workshop", "2025-11-14", "09:00", "Vancouver", "Sharpen your storytelling skills.", 30.0),
    Event(20, "Tech Innovations", R.drawable.exhibition, "Exhibition", "2025-11-15", "13:00", "Vancouver", "Interactive exhibits of new tech.", 20.0),
    Event(3, "Classical Strings", R.drawable.music, "Music", "2025-11-16", "18:30", "Montreal", "Orchestral performance by renowned string quartets.", 40.0),
    Event(9, "Hockey Classic", R.drawable.sports, "Sports", "2025-11-17", "16:00", "Montreal", "Watch top-tier teams battle on the ice.", 45.0),
    Event(15, "Coding Jam", R.drawable.workshop, "Workshop", "2025-11-16", "11:00", "Montreal", "Collaborative coding session for devs.", 25.0),
    Event(21, "History Unveiled", R.drawable.exhibition, "Exhibition", "2025-11-17", "11:00", "Montreal", "Artifacts and stories from the past.", 18.0),
    Event(4, "Pop Fiesta", R.drawable.music, "Music", "2025-11-18", "21:00", "Toronto", "Dance to the latest pop hits with live DJs.", 35.0),
    Event(10, "Soccer Cup Finals", R.drawable.sports, "Sports", "2025-11-19", "15:00", "Toronto", "Championship match with fan zones.", 30.0),
    Event(16, "DIY Furniture", R.drawable.workshop, "Workshop", "2025-11-18", "12:00", "Toronto", "Build your own furniture from scratch.", 40.0),
    Event(22, "Eco Living Fair", R.drawable.exhibition, "Exhibition", "2025-11-19", "10:00", "Toronto", "Sustainable living products and demos.", 12.0),
    Event(5, "Electronic Pulse", R.drawable.music, "Music", "2025-11-20", "22:00", "Vancouver", "EDM night with international headliners.", 50.0),
    Event(11, "Urban Skate Jam", R.drawable.sports, "Sports", "2025-11-21", "13:00", "Vancouver", "Skateboarding competition and live music.", 15.0),
    Event(17, "Digital Art Lab", R.drawable.workshop, "Workshop", "2025-11-20", "14:00", "Vancouver", "Create digital illustrations with tablets.", 35.0),
    Event(23, "Gaming Expo", R.drawable.exhibition, "Exhibition", "2025-11-21", "15:00", "Vancouver", "Latest games and gear on display.", 25.0),
    Event(6, "Folk Harmony", R.drawable.music, "Music", "2025-11-22", "17:00", "Montreal", "Acoustic folk music in a cozy setting.", 25.0),
    Event(12, "Montreal Climbing Open", R.drawable.sports, "Sports", "2025-11-23", "10:00", "Montreal", "Indoor climbing challenge for all levels.", 25.0),
    Event(18, "Startup Pitch Clinic", R.drawable.workshop, "Workshop", "2025-11-22", "10:00", "Montreal", "Practice and refine your business pitch.", 50.0),
    Event(24, "Cultural Showcase", R.drawable.exhibition, "Exhibition", "2025-11-23", "14:00", "Montreal", "Celebrate global cultures through art.", 20.0)
)