package com.example.agripure

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.agripure.Beans.Plants
import com.squareup.picasso.Picasso

class PlantsViewHolder(view: View) : RecyclerView.ViewHolder(view){

    val plantName = view.findViewById<TextView>(R.id.txtName)
    val plantImage = view.findViewById<ImageView>(R.id.imgPlant)
    val plantDetails = view.findViewById<Button>(R.id.btnDetails)

    val context = view.context

    fun render(plantModel: Plants){

        plantName.text = plantModel.name

        Picasso.get().load(plantModel.image)
            .fit().into(plantImage)

        plantDetails.setOnClickListener {
                val intent = Intent(context, PlantDetailsActivity::class.java)
            intent.putExtra("plant", plantModel)
            context.startActivity(intent)
        }
    }
}