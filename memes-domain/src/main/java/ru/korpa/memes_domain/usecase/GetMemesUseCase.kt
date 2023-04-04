package ru.korpa.memes_domain.usecase

import ru.korpa.memes_domain.models.Memes
import ru.korpa.memes_domain.repository.MemesRepository

class GetMemesUseCase(
    private val memesRepository: MemesRepository
) {

    suspend fun getMemes(): List<Memes> {
        return memesRepository.getMemesList()
    }
}