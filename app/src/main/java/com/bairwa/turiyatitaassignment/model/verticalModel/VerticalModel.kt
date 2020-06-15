package com.bairwa.turiyatitaassignment.model.verticalModel

import com.bairwa.turiyatitaassignment.model.horizontalModel.HorizontalModel

data class VerticalModel(
    var title:String,
    val children : List<HorizontalModel>
)