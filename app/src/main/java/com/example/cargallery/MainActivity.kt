package com.example.cargallery

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCars: RecyclerView
    private var list: ArrayList<Cars> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCars = findViewById(R.id.rv_cars)
        rvCars.setHasFixedSize(true)

        list.addAll(CarsData.listData)
        showRecyclerList()
    }


    private fun showRecyclerList() {
        rvCars.layoutManager = LinearLayoutManager(this)
        val listCarAdapter = ListCarAdapter(list)
        rvCars.adapter = listCarAdapter

        listCarAdapter.setOnItemClickCallback(object : ListCarAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Cars) {
                showSelectedCars(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_utama, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, Profile::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showSelectedCars(cars: Cars){
        var infoIntent:Intent? = null
        when(cars.name){
            "Ferrari F40" -> infoIntent = Intent(this@MainActivity, FerrariF40::class.java)
            "Porsche 959" -> infoIntent = Intent(this@MainActivity, Porsche959::class.java)
            "Aston Martin DB5" -> infoIntent = Intent(this@MainActivity, AstonMartinDb5::class.java)
            "Ferrari LaFerrari" ->  infoIntent = Intent(this@MainActivity, FerrariLaFerrari::class.java)
            "McLaren Senna" ->  infoIntent = Intent(this@MainActivity, MclarenSenna::class.java)
            "Porsche Carrera GT" ->  infoIntent = Intent(this@MainActivity, PorscheCarreraGt::class.java)
            "Porsche 935 Clubsport" ->  infoIntent = Intent(this@MainActivity, Porsche935::class.java)
            "Ferrari 488 Pista" ->  infoIntent = Intent(this@MainActivity, Ferrari488Pista::class.java)
            "Ferrari 812 Superfast" ->  infoIntent = Intent(this@MainActivity, Ferrari812Superfast::class.java)
            "Aston Martin One-77" ->  infoIntent = Intent(this@MainActivity, AstonMartinOne77::class.java)
        }
        startActivity(infoIntent)
    }

}