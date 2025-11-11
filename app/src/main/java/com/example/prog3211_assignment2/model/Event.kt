package com.example.prog3211_assignment2.model

import java.util.Date

data class Event (
    val id: Int,
    val name: String,
    val image: String,
    val category: String,
    val date: String,
    val time: String,
    val location: String,
    val description: String,
    val price: Double
)

val events = listOf( // TODO: Replace Image Strings
    Event(1, "Jazz Night", "jazz_night.jpg", "Music", "2025-11-12", "19:00", "Toronto", "Smooth jazz evening with local artists.", 30.0),
    Event(2, "Rock Revolution", "rock_revolution.jpg", "Music", "2025-11-14", "20:00", "Vancouver", "High-energy rock concert featuring indie bands.", 45.0),
    Event(3, "Classical Strings", "classical_strings.jpg", "Music", "2025-11-16", "18:30", "Montreal", "Orchestral performance by renowned string quartets.", 40.0),
    Event(4, "Pop Fiesta", "pop_fiesta.jpg", "Music", "2025-11-18", "21:00", "Toronto", "Dance to the latest pop hits with live DJs.", 35.0),
    Event(5, "Electronic Pulse", "electronic_pulse.jpg", "Music", "2025-11-20", "22:00", "Vancouver", "EDM night with international headliners.", 50.0),
    Event(6, "Folk Harmony", "folk_harmony.jpg", "Music", "2025-11-22", "17:00", "Montreal", "Acoustic folk music in a cozy setting.", 25.0),
    Event(7, "Basketball Showdown", "basketball_showdown.jpg", "Sports", "2025-11-13", "14:00", "Toronto", "Local teams compete in a thrilling tournament.", 20.0),
    Event(8, "Vancouver Marathon", "vancouver_marathon.jpg", "Sports", "2025-11-15", "08:00", "Vancouver", "Annual marathon through scenic routes.", 10.0),
    Event(9, "Hockey Classic", "hockey_classic.jpg", "Sports", "2025-11-17", "16:00", "Montreal", "Watch top-tier teams battle on the ice.", 45.0),
    Event(10, "Soccer Cup Finals", "soccer_cup.jpg", "Sports", "2025-11-19", "15:00", "Toronto", "Championship match with fan zones.", 30.0),
    Event(11, "Urban Skate Jam", "skate_jam.jpg", "Sports", "2025-11-21", "13:00", "Vancouver", "Skateboarding competition and live music.", 15.0),
    Event(12, "Montreal Climbing Open", "climbing_open.jpg", "Sports", "2025-11-23", "10:00", "Montreal", "Indoor climbing challenge for all levels.", 25.0),
    Event(13, "Photography Masterclass", "photo_workshop.jpg", "Workshop", "2025-11-12", "10:00", "Toronto", "Learn advanced techniques from pros.", 60.0),
    Event(14, "Creative Writing Bootcamp", "writing_bootcamp.jpg", "Workshop", "2025-11-14", "09:00", "Vancouver", "Sharpen your storytelling skills.", 30.0),
    Event(15, "Coding Jam", "coding_jam.jpg", "Workshop", "2025-11-16", "11:00", "Montreal", "Collaborative coding session for devs.", 25.0),
    Event(16, "DIY Furniture", "diy_furniture.jpg", "Workshop", "2025-11-18", "12:00", "Toronto", "Build your own furniture from scratch.", 40.0),
    Event(17, "Digital Art Lab", "digital_art.jpg", "Workshop", "2025-11-20", "14:00", "Vancouver", "Create digital illustrations with tablets.", 35.0),
    Event(18, "Startup Pitch Clinic", "pitch_clinic.jpg", "Workshop", "2025-11-22", "10:00", "Montreal", "Practice and refine your business pitch.", 50.0),
    Event(19, "Modern Art Expo", "art_expo.jpg", "Exhibition", "2025-11-13", "12:00", "Toronto", "Explore contemporary artworks.", 15.0),
    Event(20, "Tech Innovations", "tech_showcase.jpg", "Exhibition", "2025-11-15", "13:00", "Vancouver", "Interactive exhibits of new tech.", 20.0),
    Event(21, "History Unveiled", "history_unveiled.jpg", "Exhibition", "2025-11-17", "11:00", "Montreal", "Artifacts and stories from the past.", 18.0),
    Event(22, "Eco Living Fair", "eco_fair.jpg", "Exhibition", "2025-11-19", "10:00", "Toronto", "Sustainable living products and demos.", 12.0),
    Event(23, "Gaming Expo", "gaming_expo.jpg", "Exhibition", "2025-11-21", "15:00", "Vancouver", "Latest games and gear on display.", 25.0),
    Event(24, "Cultural Showcase", "cultural_showcase.jpg", "Exhibition", "2025-11-23", "14:00", "Montreal", "Celebrate global cultures through art.", 20.0)
)