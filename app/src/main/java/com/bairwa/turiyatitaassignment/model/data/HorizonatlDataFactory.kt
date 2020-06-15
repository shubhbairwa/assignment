package com.bairwa.turiyatitaassignment.model.data

import com.bairwa.turiyatitaassignment.R
import com.bairwa.turiyatitaassignment.model.horizontalModel.HorizontalModel
import java.util.*

object HorizontalDataFactory {
    private val random = Random()

    private val titles =  arrayListOf( "Carry","Carry","Carry","Carry","Carry","Carry","Carry" )

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomImage() : Int{
        return R.drawable.carr
    }

    fun getChildren(count : Int) : List<HorizontalModel>{
        val children = mutableListOf<HorizontalModel>()
        repeat(count){
            val child = HorizontalModel( randomTitle(),randomImage())
            children.add(child)
        }
        return children
    }
}