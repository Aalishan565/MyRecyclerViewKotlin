package com.example.recyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewkotlin.R
import kotlinx.android.synthetic.main.row_item.view.*

class MyAdapter(val items: ArrayList<DataItems>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.setText(items[position].fName)
        holder.tvName.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                context,
                items[position].fName + " " + items[position].lName + " Clicked",
                Toast.LENGTH_LONG
            ).show()
        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.tvName;
    }
}