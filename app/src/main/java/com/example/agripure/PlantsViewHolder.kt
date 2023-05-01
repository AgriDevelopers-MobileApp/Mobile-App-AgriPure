package com.example.agripure

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agripure.Beans.Plants
import com.squareup.picasso.Picasso

class PlantsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val plantName = view.findViewById<TextView>(R.id.txtName)
    val plantImage = view.findViewById<ImageView>(R.id.imgPlant)

    fun render(plantModel: Plants){

        plantName.text = plantModel.name

        Picasso.get().load(plantModel.image)
            .fit().into(plantImage)
    }
}