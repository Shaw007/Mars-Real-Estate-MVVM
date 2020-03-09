package com.srmstudios.marsrealestate.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.srmstudios.marsrealestate.data.database.dao.MarsPropertyDao
import com.srmstudios.marsrealestate.data.database.entity.DatabaseMarsProperty
import com.srmstudios.marsrealestate.util.Constants

@Database(entities = [DatabaseMarsProperty::class], version = Constants.DATABASE_VERSION)
abstract class MarsDatabase:RoomDatabase(){
    abstract val getMarsPropertyDao: MarsPropertyDao
}