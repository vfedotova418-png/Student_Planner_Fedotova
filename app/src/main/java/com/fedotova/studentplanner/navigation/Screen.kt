package com.fedotova.studentplanner.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details/{subjectId}") {
        fun createRoute(subjectId: String) = "details/$subjectId"
    }
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object Schedule : Screen("schedule")
    object ScheduleDetails : Screen("schedule_details/{scheduleId}") {
        fun createRoute(scheduleId: String) = "schedule_details/$scheduleId"
    }
}