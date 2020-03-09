package com.srmstudios.marsrealestate.di.module

import android.app.Application
import androidx.room.Room
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.srmstudios.marsrealestate.data.database.MarsDatabase
import com.srmstudios.marsrealestate.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideMarsDatabase(application: Application): MarsDatabase{
        return Room.databaseBuilder(application,
        MarsDatabase::class.java,
        Constants.DATABASE_NAME).build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().add(KotlinJsonAdapterFactory()).build()))
            .build()
    }
}