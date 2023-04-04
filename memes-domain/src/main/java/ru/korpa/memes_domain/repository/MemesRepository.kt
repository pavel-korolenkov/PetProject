package ru.korpa.memes_domain.repository

import ru.korpa.memes_domain.models.Memes

interface MemesRepository {

    suspend fun getMemesList(): List<Memes>
}