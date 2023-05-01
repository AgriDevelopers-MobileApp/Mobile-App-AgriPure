package com.example.agripure.Beans


class Plants {
    val id: Long
    val name: String
    val image: String
    val scientifist_name: String
    val variety: String
    val info_land_type: String
    val ph: Double
    val info_distance_between: String
    val distance_between: String
    val info_ideal_depth: String
    val depth: String
    val info_weather_conditions: String
    val weather: String
    val info_fert_fumig: String
    val intervale_fert: Int
    val intervale_fumig: Int

    constructor(
        id: Long,
        name: String,
        image: String,
        scientifist_name: String,
        variety: String,
        info_land_type: String,
        ph: Double,
        info_distance_between: String,
        distance_between: String,
        info_ideal_depth: String,
        depth: String,
        info_weather_conditions: String,
        weather: String,
        info_fert_fumig: String,
        intervale_fert: Int,
        intervale_fumig: Int
    ) {
        this.id = id
        this.name = name
        this.image = image
        this.scientifist_name = scientifist_name
        this.variety = variety
        this.info_land_type = info_land_type
        this.ph = ph
        this.info_distance_between = info_distance_between
        this.distance_between = distance_between
        this.info_ideal_depth = info_ideal_depth
        this.depth = depth
        this.info_weather_conditions = info_weather_conditions
        this.weather = weather
        this.info_fert_fumig = info_fert_fumig
        this.intervale_fert = intervale_fert
        this.intervale_fumig = intervale_fumig
    }
}