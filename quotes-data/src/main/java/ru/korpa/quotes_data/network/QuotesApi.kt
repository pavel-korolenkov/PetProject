package ru.korpa.quotes_data.network

import retrofit2.http.GET
import ru.korpa.quotes_data.model.Quote

interface QuotesApi {

    @GET("quotes/random")
    fun getRandomQuote(): Quote
}

class QuotesService {

}