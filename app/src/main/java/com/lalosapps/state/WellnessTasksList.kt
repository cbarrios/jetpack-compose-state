package com.lalosapps.state

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessTasksList(
    list: List<WellnessTask>,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { it.id }
        ) {
            WellnessTaskItem(
                taskName = it.label,
                checked = it.checked.value,
                onCheckedChange = { checked -> onCheckedTask(it, checked) },
                onClose = { onCloseTask(it) })
        }
    }
}