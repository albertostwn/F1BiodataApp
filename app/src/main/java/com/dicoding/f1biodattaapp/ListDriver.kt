package com.dicoding.f1biodattaapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ListDriver (private val listDriver: ArrayList<Driver>) : RecyclerView.Adapter<ListDriver.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_driver, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, nameTeam, photo) = listDriver[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvTeamName.text = nameTeam
    }

    override fun getItemCount(): Int = listDriver.size


    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvTeamName: TextView = itemView.findViewById(R.id.tv_team_name)
    }
}