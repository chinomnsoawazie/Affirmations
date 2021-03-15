package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize data
        val myDataSet = Datasource().loadAffirmations()
        val recycleView = findViewById<RecyclerView>(R.id.recycler_view)
        recycleView.adapter = ItemAdapter(this, myDataSet)
        recycleView.setHasFixedSize(true)
    }
}