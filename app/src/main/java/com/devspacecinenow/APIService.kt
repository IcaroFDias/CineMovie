package com.devspacecinenow

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/popular")
    fun getPopularMovies(): Call<MovieResponse>

}