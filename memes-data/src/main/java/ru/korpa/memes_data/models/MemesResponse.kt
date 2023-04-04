package ru.korpa.memes_data.models

data class MemesResponse(
    val success: Boolean,
    val data: MemesResponseData
)

data class MemesResponseData(
    val memes: List<DataMemes>
)