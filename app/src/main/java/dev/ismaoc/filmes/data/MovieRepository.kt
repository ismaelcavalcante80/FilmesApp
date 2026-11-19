package dev.ismaoc.filmes.data

import android.content.Context
import dev.ismaoc.filmes.model.Movie
import kotlinx.serialization.json.Json

class MovieRepository(
    private val context: Context
){
    fun getMovies(): List<Movie>{
        val jsonString = context.assets
            .open("filmes.json")
            .bufferedReader()
            .use { it.readText()}

        return Json {
            ignoreUnknownKeys = true
        }.decodeFromString(jsonString)
    }
}