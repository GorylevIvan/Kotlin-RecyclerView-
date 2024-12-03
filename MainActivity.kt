package com.example.kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val foods = arrayListOf<Food>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setInitialData()
        val recyclerView: RecyclerView = findViewById(R.id.list)
        val adapter = Adapter(this, foods)
        recyclerView.adapter = adapter
    }

    private fun setInitialData() {
        foods.apply {
            add(Food("Пицца", R.drawable.pizza))
            add(Food("Бургер", R.drawable.burger))
            add(Food("Роллы", R.drawable.rolls))
            add(Food("Шаурма", R.drawable.shawarma))
            add(Food("Борщ", R.drawable.borsh))
            add(Food("Мороженое", R.drawable.ice_cream))
        }
    }
}