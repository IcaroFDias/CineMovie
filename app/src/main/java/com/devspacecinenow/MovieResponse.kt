package com.devspacecinenow

import kotlinx.serialization.Serializable


data class MovieResponse(
    @Serializable
    val results: List<MovieDto>
)