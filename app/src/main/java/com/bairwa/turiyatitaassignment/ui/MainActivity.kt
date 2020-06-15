package com.bairwa.turiyatitaassignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bairwa.turiyatitaassignment.R
import com.bairwa.turiyatitaassignment.adapter.VerticalRecyclerViewAdapter
import com.bairwa.turiyatitaassignment.model.data.VerticalProviderfctory
import com.bairwa.turiyatitaassignment.model.horizontalModel.HorizontalModel
import com.bairwa.turiyatitaassignment.model.verticalModel.VerticalModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()


    }



    private fun setUpRecyclerView() {
        verticalRecyclerView.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = VerticalRecyclerViewAdapter(this@MainActivity,VerticalProviderfctory.getParents(40))

        }
    }
}