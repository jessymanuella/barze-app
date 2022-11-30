//package com.example.barze_individual_page
//
//import android.content.Context
//import androidx.recyclerview.widget.RecyclerView
//import android.content.res.Configuration
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import com.bumptech.glide.Glide
//
//class MenuAdapter (private val context: Context, private val items: List<Int>):
//    RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
////"ViewHolder" extends the existing RecyclerView viewholder
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        return ViewHolder()
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//    }
//
//    override fun getItemCount(): Int {
//        return 5;
//    }
//
//    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val orientation = context.resources.configuration.orientation
//
//
//
//        fun bind(number: Int) {
//
//        }
//    }
//
//}