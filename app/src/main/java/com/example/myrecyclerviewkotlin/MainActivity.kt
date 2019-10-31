package com.example.myrecyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewinkotlin.DataItems
import com.example.recyclerviewinkotlin.MyAdapter

class MainActivity : AppCompatActivity() {
    private val listInputData: ArrayList<DataItems> = ArrayList()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        prepareList()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(listInputData, this)
    }

    private fun prepareList() {
        listInputData.add(DataItems("A", "A"))
        listInputData.add(DataItems("B", "B"))
        listInputData.add(DataItems("C", "C"))
        listInputData.add(DataItems("D", "D"))
        listInputData.add(DataItems("E", "E"))
        listInputData.add(DataItems("F", "F"))
        listInputData.add(DataItems("G", "G"))
        listInputData.add(DataItems("H", "H"))
        listInputData.add(DataItems("I", "I"))
    }
}
