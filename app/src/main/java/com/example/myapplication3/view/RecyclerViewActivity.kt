package com.example.myapplication3.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.databinding.ActivityRecyclerViewBinding
import com.example.myapplication3.model.ObjectDataSample

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRecyclerViewBinding
    private lateinit var mAdapter: AndroidVersionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Create the instance of adapter
        mAdapter = AndroidVersionAdapter()


        // We define the style
        binding.recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        // We set the adapter to recycler view
        binding.recyclerView.adapter = mAdapter


        // Generate data and give it to adapter
        mAdapter.submitList(generateFakeData())
    }

    private fun generateFakeData(): ArrayList<ObjectDataSample> {
        return arrayListOf(
            ObjectDataSample("Peugeot 307", 160f),
            ObjectDataSample("Benz Velo", 20f),
            ObjectDataSample("Mercedes-Benz 300SL", 245.5f),
            ObjectDataSample("Aston Martin DB4 GT", 245f),
            ObjectDataSample("Iso Grifo GL 365", 259f),
            ObjectDataSample("AC Cobra Mk III 427", 266f),
        )
    }

}