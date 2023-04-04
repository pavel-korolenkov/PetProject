package ru.korpa.memes_data.models

import ru.korpa.memes_domain.models.Memes

data class DataMemes(
    val id: String,
    val name: String,
    val url: String,
    val width: Int,
    val height: Int,
    val box_count: Int,
    val captions: Int,
)


fun DataMemes.toMemes(): Memes {
    return Memes(name)
}