package com.example.agripure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agripure.Beans.Plants

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        getPlants()
    }

    fun getPlants() {

        val plantsList = mutableListOf<Plants>()

        plantsList.add(
            Plants(1, "Cauliflower", "https://www.gob.mx/cms/uploads/article/main_image/45015/coliflor.jpg", "", "", "", 7.5, "", "", "", "", "", "", "", 5, 5)
        )

        plantsList.add(
            Plants(2, "Apple", "https://www.recetasnestle.com.pe/sites/default/files/styles/crop_article_banner_desktop_nes/public/2022-07/banner-manzana-verde-y-roja.jpg?itok=UjiFQnEs", "", "", "", 7.5, "", "", "", "", "", "", "", 5, 5)
        )

        val recycler = findViewById<RecyclerView>(R.id.recyclerPlants)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.adapter = PlantsAdapter(plantsList)
    }
}