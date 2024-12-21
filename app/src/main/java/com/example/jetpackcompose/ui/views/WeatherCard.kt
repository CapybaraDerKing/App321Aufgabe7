import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.views.ForecastItem

@Composable
fun WeatherCard(
    forecastItem: ForecastItem,
    modifier: Modifier = Modifier
) {
    // Implementiere hier die Darstellung des ForecastItems
    Box(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        // Beispiel: Nutze die forecastItem-Daten hier
        Text(text = forecastItem.toString())
    }
}
