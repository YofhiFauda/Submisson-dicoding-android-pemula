package com.example.submission_android_pemula.yofhi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission_android_pemula.R

class ListCatAdapter(private val listCat: ArrayList<Cat>): RecyclerView.Adapter<ListCatAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_cat, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCat.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listCat[position]
        Glide.with(holder.itemView.context)
            .load(Integer.valueOf(photo))  // photo adalah ID drawable
            .into(holder.imgPhoto)
//        Glide.with(holder.itemView.context)
//            .load(photo)
//            .apply(RequestOptions())
//            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDescription.text = description

        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailCat::class.java)
            moveDetail.putExtra(DetailCat.EXTRA_NAME, name)
            moveDetail.putExtra(DetailCat.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailCat.EXTRA_IDENTITY, description)
            mContext.startActivity(moveDetail)
        }
    }
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)

    }

}