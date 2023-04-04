package ru.korpa.memes_data.repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import ru.korpa.memes_data.api.MemesApi
import ru.korpa.memes_data.models.toMemes
import ru.korpa.memes_domain.models.Memes
import ru.korpa.memes_domain.repository.MemesRepository
import kotlin.coroutines.CoroutineContext

class MemesRepositoryImpl(
    private val servise: MemesApi,
    private val coroutineContext: CoroutineContext
) : MemesRepository {

    override suspend fun getMemesList(): List<Memes> {
        return withContext(coroutineContext) {

            delay(3000L)
            servise.getMemes().data.memes.take(1).map { it.toMemes() }
        }
    }
}