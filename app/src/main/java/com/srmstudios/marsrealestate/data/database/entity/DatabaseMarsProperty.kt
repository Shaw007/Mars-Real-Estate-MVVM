package com.srmstudios.marsrealestate.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mars_property")
data class DatabaseMarsProperty(@PrimaryKey val id: String,
val type: String,
val price: Double,
val imgSrcUrl: String)