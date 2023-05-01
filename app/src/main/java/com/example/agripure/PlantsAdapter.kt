package com.example.agripure

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.agripure.Beans.Plants

class PlantsAdapter(val plantsList: List<Plants>): RecyclerView.Adapter<PlantsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlantsViewHolder(layoutInflater.inflate(R.layout.plant_item, parent, false))
    }

    override fun onBindViewHolder(holder: PlantsViewHolder, position: Int) {
        val item = plantsList[position]
        holder.render(item)
    }




    override fun getItemCount(): Int = plantsList.size
}