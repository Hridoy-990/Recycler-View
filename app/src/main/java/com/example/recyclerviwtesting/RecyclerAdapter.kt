package com.example.recyclerviwtesting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var title = arrayOf("Introduction to Computer" , "Bangla" , "English" , "Vector Geometry" , "A Brown fox Jumps quickly over the lazy dog")
    private var icon = arrayOf(R.drawable.ic_baseline_arrow_right_24 , R.drawable.ic_baseline_arrow_right_24 , R.drawable.ic_baseline_arrow_right_24 , R.drawable.ic_baseline_arrow_right_24 , R.drawable.ic_baseline_arrow_right_24)
    private var image = arrayOf(R.drawable.bcs , R.drawable.bcs , R.drawable.bcs , R.drawable.bcs , R.drawable.bcs)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout , parent , false)
         return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemIcon.setImageResource(icon[position])
        holder.itemImage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }
    inner class ViewHolder(itemViw : View): RecyclerView.ViewHolder(itemViw){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemIcon:ImageView
        init {
            itemImage = itemViw.findViewById(R.id.item_image)
            itemTitle = itemViw.findViewById(R.id.item_title)
            itemIcon = itemViw.findViewById(R.id.item_icon)
           itemViw.setOnClickListener{
               val position : Int = adapterPosition
               Toast.makeText(itemViw.context , "Yow click on ${title[position]}" , Toast.LENGTH_LONG).show()
           }
        }

    }
}