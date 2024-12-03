package com.example.kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    context: Context,
    private val foods: List<Food>
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = foods[position]
        holder.pictView.setImageResource(food.picture)
        holder.nameView.text = food.name
    }

    override fun getItemCount(): Int = foods.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val pictView: ImageView = view.findViewById(R.id.pict)
        val nameView: TextView = view.findViewById(R.id.name)
    }
}