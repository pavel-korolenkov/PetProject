package ru.korpa.petproject.di.modules

import dagger.Module
import dagger.Provides
import ru.korpa.memes_domain.repository.MemesRepository
import ru.korpa.memes_domain.usecase.GetMemesUseCase

@Module
class MemesUseCasesModule {

    @Provides
    fun provideGetMemesUseCase(repository: MemesRepository): GetMemesUseCase {
        return GetMemesUseCase(repository)
    }
}