package ru.korpa.petproject.di.modules

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import ru.korpa.memes_data.api.MemesApi
import ru.korpa.memes_data.repository.MemesRepositoryImpl
import ru.korpa.memes_domain.repository.MemesRepository
import kotlin.coroutines.CoroutineContext

@Module
class MemesRepositoryModule {

    @Provides
    fun provideMemesRepository(service: MemesApi, dispatcher: CoroutineContext): MemesRepository = MemesRepositoryImpl(service, dispatcher)

    @Provides
    fun provideMemesService(): MemesApi = MemesApi.getInstance()

    @Provides
    fun provideCoroutineDispatcher(): CoroutineContext = Dispatchers.IO
}