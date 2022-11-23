package com.example.buynow.presentation.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buynow.presentation.adapter.VisualSearchResultAdapter
import com.example.buynow.R
import com.example.buynow.data.model.Product
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class VisualResultActivity : AppCompatActivity() {


    lateinit var predictNameTV:TextView
    lateinit var resultProduct:ArrayList<Product>


    lateinit var visualSearchResultAdapter: VisualSearchResultAdapter
    lateinit var predictedRecView:RecyclerView

    var PredictName: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visual_result)

        PredictName = intent.getStringExtra("PredictName").toString()

        predictedRecView = findViewById(R.id.predictedRecView)
        predictNameTV = findViewById(R.id.predictNameTV)
        predictNameTV.text = "Search for "+PredictName

        resultProduct = arrayListOf()

        setResultData()

        predictedRecView.apply {
            layoutManager = GridLayoutManager(context, 2)
        }
        predictedRecView.setHasFixedSize(true)
        visualSearchResultAdapter = VisualSearchResultAdapter(resultProduct,this)
        predictedRecView.adapter = visualSearchResultAdapter



    }

    fun getJsonData(context: Context, fileName: String): String? {

        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    private fun setResultData() {

        val jsonFileString = this.let {

            getJsonData(it, "NewProducts.json")
        }
        val gson = Gson()

        val listCoverType = object : TypeToken<List<Product>>() {}.type

        var coverD: List<Product> = gson.fromJson(jsonFileString, listCoverType)

        coverD.forEachIndexed { idx, person ->

            if (coverD[idx].productCategory == PredictName || coverD[idx].productName == PredictName){
                resultProduct.add(coverD[idx])
            }

        }


    }
}