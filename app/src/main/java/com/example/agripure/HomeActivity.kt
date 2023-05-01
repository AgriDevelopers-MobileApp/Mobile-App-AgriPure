package com.example.agripure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
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
            Plants(1,
                "Cauliflower",
                "https://www.gob.mx/cms/uploads/article/main_image/45015/coliflor.jpg",
                "Brassica oleracea var. botrytis",
                "Brassica oleracea",
                "Cauliflower is grown in a wide variety of soils. The best results are obtained in loamy, deep soils with a good content of organic matter. Cauliflower is very sensitive to soil acidity, it develops well in soils with a pH between 5.5 and 6.5.",
                7.5,
                "Planting distances vary according to the time of year in which it is planted; in the dry season it can be sown at 50 cm between plants and 60 cm between rows and in the rainy season it is advisable to widen the distance between rows to 80 cm.",
                "5",
                "You can then sow 3-4 seeds in each hole at a depth of 0.5-1.5 cm (0.2-0.6 inches) and gently cover with soil. You can water immediately after sowing. Cauliflower germinates best at an average temperature of 80°F (26°C). The seed needs to have optimal moisture levels to germinate.",
                "5",
                "The crop develops well in regions with temperatures between 15 and 18ºC. Regarding altitude, it has been found that cauliflower produces good quality inflorescence between 1,860 (Tapezco) and 2,900 meters above sea level (San Juan de Chicuá), although the cultivar and the climate of the area will determine the success of the crop.",
                "soleado",
                "Fertilization or subscriber:\n" +
                        "Fertilizing at the right time is crucial to getting the most out of your cauliflower crops. In general, you should pay once every two weeks during periods of active growth. In the case of transplants, pay once before the transplant and again two weeks after.\n" +
                        "\n" +
                        "Fumigation:\n" +
                        "This plant should be fumigated every 3-5 weeks in order to isolate them from mosquitoes and other pests, this by spraying the fumigation on the plant itself. On the other hand, drenching the soil with insecticide can prevent the formation of larvae for a period of 7 weeks.", 5, 5)
        )

        plantsList.add(
            Plants(2,
                "Apple",
                "https://www.recetasnestle.com.pe/sites/default/files/styles/crop_article_banner_desktop_nes/public/2022-07/banner-manzana-verde-y-roja.jpg?itok=UjiFQnEs",
                "Pyrus malus L",
                "Malus domestica",
                "The apple tree can thrive in average soil with a pH close to 7, for this it must be well drained and free of standing water. However, the best yields are reported in fertile and loamy sandy soils with a pH between 6 and 7.",
                7.5,
                "The distance we leave between the apple trees depends on the apple variety, and more specifically on the final size of the mature tree and our preference for extensive agriculture. Distances between rows and between trees in the row range from 22 X 16 ft to 6 X 6 ft (7m X 5m to 1.8m X 1.8m).",
                "6",
                "Begin by digging a hole 25 inches (63 cm) in diameter and 25 inches (63 cm) deep for each sapling you plan to plant. Trees are carefully placed in the holes and covered with soil.",
                "13",
                "Most commercial apple tree varieties thrive in cool, wet weather, where a cold winter is followed by cool spring and summer.",
                "12",
                "Apple tree pests can affect different organs of the tree, such as fruits, leaves, branches or roots, with fruit damage being the most visible and causing the most losses to the farmer during the harvest. There is a wide group of species considered pests, among which the apple moth or carpocapsa, the two-spotted mite, the aphid and the thrips stand out.", 5, 5)
        )

        val recycler = findViewById<RecyclerView>(R.id.recyclerPlants)
        recycler.layoutManager = LinearLayoutManager(applicationContext)
        recycler.adapter = PlantsAdapter(plantsList)
    }
}