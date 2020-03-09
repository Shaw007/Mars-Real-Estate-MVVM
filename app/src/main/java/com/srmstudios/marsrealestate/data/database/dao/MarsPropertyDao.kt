package com.srmstudios.marsrealestate.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.srmstudios.marsrealestate.data.database.entity.DatabaseMarsProperty

@Dao
interface MarsPropertyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(marsProperties: List<DatabaseMarsProperty>)

    @Query("select * from mars_property")
    fun getMarsProperties(): List<DatabaseMarsProperty>
}