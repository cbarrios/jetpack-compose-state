package com.lalosapps.state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * ViewModels are recommended to be used at screen-level composables, that is,
 * close to a root composable called from an activity, fragment, or destination of a Navigation graph.
 * ViewModels should never be passed down to other composables, instead you should pass only the data
 * they need and functions that perform the required logic as parameters.
 *
 * Warning: ViewModels are not part of the Composition. Therefore, you should not hold state
 * created in composables (for example, a remembered value) because this could cause memory leaks.
 */

@Preview(showBackground = true)
@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter(modifier)
        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { it, checked ->
                wellnessViewModel.changeTaskChecked(it, checked)
            },
            onCloseTask = { wellnessViewModel.remove(it) },
            modifier = modifier
        )
    }
}
