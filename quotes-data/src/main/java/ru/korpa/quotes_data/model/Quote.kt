package ru.korpa.quotes_data.model

data class Quote(
    val id: String,
    val originator: Originator,
    val languageCode: String,
    val content: String,
    val url: String,
    val tags: List<String>
)

data class Originator(
    val id: String,
    val languageCode: String,
    val description: String,
    val master_id: Long,
    val name: Long,
    val url: Long
)