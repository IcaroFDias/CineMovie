package com.devspacecinenow

import okhttp3.Call
import retrofit2.http.GET

interface ApiService {
    @GET("https://api.themoviedb.org/3/movie")
    fun getPopularMovies(): Call<List<Unit>>
}