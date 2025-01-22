package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "c706281738a919f22f52abca28388459"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}