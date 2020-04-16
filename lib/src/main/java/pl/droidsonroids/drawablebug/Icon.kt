package pl.droidsonroids.drawablebug

import pl.droidsonroids.drawablebug.lib.R

val TimeOfDay.icon
    get() = when (this) {
        TimeOfDay.Morning -> R.drawable.morning
        TimeOfDay.Evening -> R.drawable.evening
    }