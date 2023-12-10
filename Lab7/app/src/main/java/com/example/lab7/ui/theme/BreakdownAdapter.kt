package com.example.lab7.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab7.R
import java.util.zip.Inflater

class BreakdownAdapter(): RecyclerView.Adapter<BreakdownAdapter.BreakdownViewHolder>() {


    class BreakdownViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var expenseType: TextView = itemView.findViewById(R.id.expenseIcon)
        var expenseTitle: TextView = itemView.findViewById(R.id.expenseTitle)
        var price: TextView = itemView.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreakdownViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.breakdown_view, parent, false)
        return BreakdownViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BreakdownViewHolder, position: Int) {

    }


}
