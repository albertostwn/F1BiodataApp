package com.dicoding.f1biodattaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDriver: RecyclerView
    private val list = ArrayList<Driver>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDriver = findViewById(R.id.rv_driver)
        rvDriver.setHasFixedSize(true)

        list.addAll(getListDriver())
        showRecycleList()
    }

    private fun getListDriver(): ArrayList<Driver> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_team)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listDriver = ArrayList<Driver>()
        for (i in dataName.indices) {
            val driver = Driver(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listDriver.add(driver)
        }
        return listDriver
    }

    private fun showRecycleList() {
        rvDriver.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListDriver(list)
        rvDriver.adapter = listHeroAdapter
    }
}