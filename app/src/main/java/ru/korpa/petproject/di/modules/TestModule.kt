package ru.korpa.petproject.di.modules

import dagger.Module
import dagger.Provides
import ru.korpa.petproject.TestObject

@Module
class TestModule {

    @Provides
    fun provideTestObject() = TestObject("name", 12)

}