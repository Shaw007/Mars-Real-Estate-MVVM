package com.srmstudios.marsrealestate.di.module

import com.srmstudios.marsrealestate.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}