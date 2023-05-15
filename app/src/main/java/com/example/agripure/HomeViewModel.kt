package com.example.agripure

import androidx.lifecycle.ViewModel
import com.example.agripure.Beans.Plants

class HomeViewModel: ViewModel() {
    var plantList: MutableList<Plants> = mutableListOf()
    var plant: Plants = Plants(0,"", "", "", "", "",
                            0.0,"", "","","","",
                        "", "", 0, 0)

}