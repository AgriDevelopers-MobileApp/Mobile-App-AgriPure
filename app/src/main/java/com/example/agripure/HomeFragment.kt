package com.example.agripure

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agripure.Beans.Plants
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Calendar


class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: HomeViewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel::class.java)

        val txtTitle: TextView = view.findViewById(R.id.txtTitle)

        val greetingMessage = when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)){
            in 0..11-> "Good Morning"
            in 12..17-> "Good Afternoon"
            else -> "Good Night"
        }

        txtTitle.text = greetingMessage

        recyclerView = view.findViewById(R.id.recyclerPlants)

        GlobalScope.launch(Dispatchers.Main){
            recyclerView.layoutManager = GridLayoutManager(context, 2)
            recyclerView.adapter = PlantsAdapter(viewModel.plantList)
        }
        return view
    }

}