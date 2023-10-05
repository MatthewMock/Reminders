package com.example.reminders.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @StringRes val stringResourceId1: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId2: Int,
)
