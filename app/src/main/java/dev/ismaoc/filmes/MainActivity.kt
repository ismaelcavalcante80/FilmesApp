package dev.ismaoc.filmes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.ismaoc.filmes.data.MovieRepository
import dev.ismaoc.filmes.ui.theme.FilmesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository = MovieRepository(this)
        val movies = repository.getMovies()

        setContent {
            FilmesTheme {
                MovieApp(
                    movies = movies
                )
            }
        }

    }
}
