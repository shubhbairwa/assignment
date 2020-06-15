package com.bairwa.turiyatitaassignment.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bairwa.turiyatitaassignment.R
import com.bairwa.turiyatitaassignment.model.horizontalModel.HorizontalModel
import com.bairwa.turiyatitaassignment.ui.AudioPlayActivity
import kotlinx.android.synthetic.main.item_horizontal.view.*

class HorizontalRecycleViewAdapter(var context:Context,private val list: List<HorizontalModel>):RecyclerView.Adapter<HorizontalRecycleViewAdapter.HorizontalViewHolder>() {



    inner class HorizontalViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
     return HorizontalViewHolder(LayoutInflater.from(context).inflate(R.layout.item_horizontal,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        var horizontalModel=list[position]
        holder.itemView.apply {
            titleNew.text=horizontalModel.name
            image.setImageResource(horizontalModel.image)
            setOnClickListener {
                 Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show()
               val intet= Intent(context,AudioPlayActivity::class.java)
                context.startActivity(intet)

            }
        }

    }
}