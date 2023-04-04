package ru.korpa.petproject.di

import dagger.Component
import ru.korpa.petproject.MainActivity
import ru.korpa.petproject.di.modules.MemesRepositoryModule
import ru.korpa.petproject.di.modules.MemesUseCasesModule
import ru.korpa.petproject.di.modules.TestModule

@Component(
    modules = [
        TestModule::class,
        MemesUseCasesModule::class,
        MemesRepositoryModule::class
    ]
)
interface PPComponent {

    fun inject(activity: MainActivity)
}