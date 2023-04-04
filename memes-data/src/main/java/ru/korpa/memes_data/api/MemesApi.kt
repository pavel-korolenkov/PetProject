package ru.korpa.memes_data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import ru.korpa.memes_data.models.MemesResponse

interface MemesApi {

    @GET("get_memes")
    suspend fun getMemes(): MemesResponse

    companion object {
        private var retrofitService: MemesApi? = null

        fun getInstance(): MemesApi {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.imgflip.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(MemesApi::class.java)
            }
            return retrofitService!!
        }
    }
}