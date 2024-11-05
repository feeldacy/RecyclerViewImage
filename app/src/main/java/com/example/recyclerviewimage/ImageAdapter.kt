package com.example.recyclerviewimage

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val imageList: List<ImageItem>):
    RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

        class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val imageView: ImageView = itemView.findViewById(R.id.imageView)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_recycler, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int){
        val imageItem = imageList[position]
        holder.imageView.setImageResource(imageItem.imageResId)
    }

    override fun getItemCount() = imageList.size
}