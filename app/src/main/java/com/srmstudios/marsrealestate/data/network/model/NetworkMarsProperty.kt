package com.srmstudios.marsrealestate.data.network.model

import com.squareup.moshi.Json

data class NetworkMarsProperty(val id: String,
                               val type: String,
                               val price: Double,
                               @Json(name = "img_src") val imgSrcUrl: String)