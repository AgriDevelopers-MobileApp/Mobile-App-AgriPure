package com.example.agripure

import android.animation.LayoutTransition
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.lifecycle.ViewModelProvider
import com.example.agripure.Beans.Plants
import com.squareup.picasso.Picasso


class PlantDetailFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_plant_details, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel::class.java)

        val cardView: CardView = view.findViewById(R.id.cardView)
        val expandedContent: LinearLayout = view.findViewById(R.id.expandedContent)

        val cardView2: CardView = view.findViewById(R.id.cardView2)
        val expandedContent2: LinearLayout = view.findViewById(R.id.expandedContent2)

        val cardView3: CardView = view.findViewById(R.id.cardView3)
        val expandedContent3: LinearLayout = view.findViewById(R.id.expandedContent3)

        val cardView4: CardView = view.findViewById(R.id.cardView4)
        val expandedContent4: LinearLayout = view.findViewById(R.id.expandedContent4)

        val cardView5: CardView = view.findViewById(R.id.cardView5)
        val expandedContent5: LinearLayout = view.findViewById(R.id.expandedContent5)

        val txtName: TextView = view.findViewById(R.id.txtTitle)
        val txtScientific: TextView = view.findViewById(R.id.txtScientificName)
        val txtVariety: TextView = view.findViewById(R.id.txtVariety)
        val imgPlant: ImageView = view.findViewById(R.id.imgPlant)
        val txtLand: TextView = view.findViewById(R.id.land)
        val txtDepth: TextView = view.findViewById(R.id.depth)
        val txtSpacing: TextView = view.findViewById(R.id.distance)
        val txtWheather: TextView = view.findViewById(R.id.wheather)
        val txtFertilization: TextView = view.findViewById(R.id.fertilization)

        txtName.text = viewModel.plant.name + " Details"
        txtScientific.text = "Scientific name: " + viewModel.plant.scientifist_name
        txtVariety.text = "Variety: " + viewModel.plant.variety
        txtLand.text = viewModel.plant.info_land_type
        txtDepth.text = viewModel.plant.info_ideal_depth
        txtSpacing.text = viewModel.plant.info_distance_between
        txtWheather.text = viewModel.plant.info_weather_conditions
        txtFertilization.text = viewModel.plant.info_fert_fumig

        Picasso.get().load(viewModel.plant.image)
            .fit().into(imgPlant)

        expandedContent.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expandedContent2.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expandedContent3.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expandedContent4.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expandedContent5.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)

        cardView.setOnClickListener(){
            val v = if(txtLand.visibility == View.GONE) View.VISIBLE else View.GONE
            txtLand.visibility = v
        }

        cardView2.setOnClickListener(){
            val v = if(txtSpacing.visibility == View.GONE) View.VISIBLE else View.GONE
            txtSpacing.visibility = v
        }

        cardView3.setOnClickListener(){
            val v = if(txtDepth.visibility == View.GONE) View.VISIBLE else View.GONE
            txtDepth.visibility = v
        }

        cardView4.setOnClickListener(){
            val v = if(txtWheather.visibility == View.GONE) View.VISIBLE else View.GONE
            txtWheather.visibility = v
        }

        cardView5.setOnClickListener(){
            val v = if(txtFertilization.visibility == View.GONE) View.VISIBLE else View.GONE
            txtFertilization.visibility = v
        }

        return view
    }
}