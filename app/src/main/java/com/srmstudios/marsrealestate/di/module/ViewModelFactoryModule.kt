package com.srmstudios.marsrealestate.di.module

import androidx.lifecycle.ViewModelProvider
import com.srmstudios.marsrealestate.di.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelProviderFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}