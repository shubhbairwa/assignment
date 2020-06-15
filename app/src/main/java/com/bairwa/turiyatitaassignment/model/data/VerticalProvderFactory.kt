package com.bairwa.turiyatitaassignment.model.data

import com.bairwa.turiyatitaassignment.model.horizontalModel.HorizontalModel
import com.bairwa.turiyatitaassignment.model.verticalModel.VerticalModel
import java.util.*

object VerticalProviderfctory {

        private val random = Random()

        private val titles =  arrayListOf("Click to play-YALGAAR","Click to play-YALGAAR","Click to play-YALGAAR")

        private fun randomTitle() : String{
            val index = random.nextInt(titles.size)
            return titles[index]
        }

        private fun randomChildren() : List<HorizontalModel>{
            return HorizontalDataFactory.getChildren(20)
        }

        fun getParents(count : Int) : List<VerticalModel>{
            val parents = mutableListOf<VerticalModel>()
            repeat(count){
                val parent = VerticalModel(randomTitle(), randomChildren())
                parents.add(parent)
            }
            return parents
        }


}