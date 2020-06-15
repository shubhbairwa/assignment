package com.bairwa.turiyatitaassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bairwa.turiyatitaassignment.R
import com.bairwa.turiyatitaassignment.model.horizontalModel.HorizontalModel
import com.bairwa.turiyatitaassignment.model.verticalModel.VerticalModel
import kotlinx.android.synthetic.main.item_vertical.view.*

class VerticalRecyclerViewAdapter(var context:Context,private val verticalList: List<VerticalModel>):RecyclerView.Adapter<VerticalRecyclerViewAdapter.VerticalViewHolder>() {

private val viewPool=RecyclerView.RecycledViewPool()


    inner class VerticalViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        return VerticalViewHolder(LayoutInflater.from(context).inflate(R.layout.item_vertical,parent,false))
    }

    override fun getItemCount(): Int {
    return verticalList.size
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
       val verticalModel=verticalList[position]

        holder.itemView.apply {
            titleHorizontal.text=verticalModel.title
        }
        val horizontalLayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
        horizontalLayoutManager.initialPrefetchItemCount = 4
        holder.itemView.recyclerView1.apply {
            layoutManager = horizontalLayoutManager
            adapter = HorizontalRecycleViewAdapter(context,verticalModel.children)
            setRecycledViewPool(viewPool)
        }

    }
}