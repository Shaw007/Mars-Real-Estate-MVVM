package com.srmstudios.marsrealestate.di.component

import android.app.Application
import com.srmstudios.marsrealestate.MarsApplication
import com.srmstudios.marsrealestate.di.module.ActivityBuilderModule
import com.srmstudios.marsrealestate.di.module.AppModule
import com.srmstudios.marsrealestate.di.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,
ActivityBuilderModule::class,
ViewModelFactoryModule::class,
AppModule::class])
interface AppComponent: AndroidInjector<MarsApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}