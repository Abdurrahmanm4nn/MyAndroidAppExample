package com.example.cargallery

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCarAdapter( val listCars: ArrayList<Cars>) : RecyclerView.Adapter<ListCarAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_cars, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val cars = listCars[position]
        Glide.with(holder.itemView.context)
                .load(cars.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        holder.tvName.text = cars.name
        holder.tvDetail.text = cars.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCars[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listCars.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Cars)
    }

}