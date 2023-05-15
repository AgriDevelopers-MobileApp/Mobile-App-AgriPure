package com.example.agripure

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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
            .resize(350,250)
            .centerCrop().into(plantImage)

        val viewModel = ViewModelProvider(context as AppCompatActivity).get(HomeViewModel::class.java)

        plantDetails.setOnClickListener {
            viewModel.plant = plantModel
            val fragmentDetails = PlantDetailFragment()
            val transaction = (context as AppCompatActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragmentDetails)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}