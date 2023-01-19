package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reciclerview.adapters.DiosAdapter
import com.example.reciclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }
    // Inicializar el RecyclerView
    fun initRecyclerView(){

        val recyclerView = binding.reciclerMain
        recyclerView.adapter = DiosAdapter(this)
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
    }


}