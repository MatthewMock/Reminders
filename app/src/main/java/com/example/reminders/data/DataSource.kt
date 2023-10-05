package com.example.reminders.data

import com.example.reminders.R
import com.example.reminders.model.Day

object DataSource {
    val days = listOf(
        Day(R.string.day1, R.drawable.medication, R.string.reminder1),
        Day(R.string.day2, R.drawable.exercise, R.string.reminder2),
        Day(R.string.day3, R.drawable.study, R.string.reminder3),
        Day(R.string.day4, R.drawable.meditate, R.string.reminder4),
        Day(R.string.day5, R.drawable.work, R.string.reminder5),
        Day(R.string.day6, R.drawable.sleep, R.string.reminder6),
        Day(R.string.day7, R.drawable.friends, R.string.reminder7),
        Day(R.string.day8, R.drawable.party, R.string.reminder8)
    )
}