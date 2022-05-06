package com.lalosapps.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class WellnessTask(
    val id: Int,
    val label: String,
    val checked: MutableState<Boolean> = mutableStateOf(false)
)

// This is an example on how to implement it with the 'by' delegate
/**
class WellnessTask(
val id: Int,
val label: String,
initialChecked: Boolean = false
) {
var checked by mutableStateOf(initialChecked)
}*/


