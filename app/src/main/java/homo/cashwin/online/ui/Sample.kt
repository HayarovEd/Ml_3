package homo.cashwin.online.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import homo.cashwin.online.domain.model.StatusApplication.Loading
import homo.cashwin.online.domain.model.StatusApplication.NoConnect
import homo.cashwin.online.domain.model.StatusApplication.Web

@Composable
fun Sample(
    viewModel: MainViewModel = hiltViewModel(),
) {
    val state = viewModel.state.collectAsState()
    when (val currentState = state.value.statusApplication) {
        Loading -> LoadingScreen()
        NoConnect -> {
            NoConnectScreen()
        }

        is Web -> {
            WebViewScreen(url = currentState.url)
        }
    }
}