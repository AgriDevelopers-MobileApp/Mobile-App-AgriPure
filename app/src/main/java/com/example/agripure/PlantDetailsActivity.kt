package com.example.agripure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.ImageView
import android.widget.TextView
import com.example.agripure.Beans.Plants
import com.squareup.picasso.Picasso

class PlantDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_details)

        val txtName: TextView = findViewById(R.id.txtTitle)
        val txtScientific: TextView = findViewById(R.id.txtScientificName)
        val txtVariety: TextView = findViewById(R.id.txtVariety)
        val imgPlant: ImageView = findViewById(R.id.imgPlant)
        val txtLand: TextView = findViewById(R.id.land)
        val txtDepth: TextView = findViewById(R.id.depth)
        val txtSpacing: TextView = findViewById(R.id.distance)
        val txtWheather: TextView = findViewById(R.id.wheather)
        val txtFertilization: TextView = findViewById(R.id.fertilization)


        val plantModel = intent.getSerializableExtra("plant") as Plants

        txtName.text = plantModel.name + " Details"
        txtScientific.text = "Scientific name: " + plantModel.scientifist_name
        txtVariety.text = "Variety: " + plantModel.variety
        txtLand.text = plantModel.info_land_type
        txtDepth.text = plantModel.info_ideal_depth
        txtSpacing.text = plantModel.info_distance_between
        txtWheather.text = plantModel.info_weather_conditions
        txtFertilization.text = plantModel.info_fert_fumig



        Picasso.get().load(plantModel.image)
            .fit().into(imgPlant)

    }
}