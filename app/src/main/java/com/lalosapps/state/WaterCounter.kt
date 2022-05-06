package com.lalosapps.state

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/** It's a good practice to provide a default [Modifier] to all composable functions, as it increases reusability.
 *  It should appear as the first optional parameter in the parameter list, after all required parameters.
 */
@Preview(showBackground = true)
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text(text = "You've had $count glasses.")
        Button(onClick = { count++ }, modifier = modifier.padding(top = 8.dp)) {
            Text(text = "Add one")
        }
    }
}