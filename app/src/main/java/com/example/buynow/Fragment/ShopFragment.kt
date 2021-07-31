package com.example.buynow.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buynow.Adapter.CategoryAdapter
import com.example.buynow.Adapter.CoverProductAdapter

import com.example.buynow.Model.Category
import com.example.buynow.Model.Product

import com.example.buynow.Model.Shop
import com.example.buynow.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.io.IOException


class ShopFragment : Fragment() {


    lateinit var cateList:ArrayList<Category>
    lateinit var coverProduct:ArrayList<Product>

    lateinit var categoryAdapter: CategoryAdapter
    lateinit var coverProductAdapter: CoverProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_shop, container, false)
        activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val coverRecView_shopFrag : RecyclerView = view.findViewById(R.id.coverRecView_shopFrag)
        val categoriesRecView : RecyclerView = view.findViewById(R.id.categoriesRecView)


        cateList = arrayListOf()
        coverProduct = arrayListOf()

        setCoverData()
        setCategoryData()

        coverRecView_shopFrag.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
        coverRecView_shopFrag.setHasFixedSize(true)
        coverProductAdapter = CoverProductAdapter(activity as Context, coverProduct )
        coverRecView_shopFrag.adapter = coverProductAdapter


        categoriesRecView.layoutManager = GridLayoutManager(context,2,LinearLayoutManager.VERTICAL,false)
        categoriesRecView.setHasFixedSize(true)
        categoryAdapter = CategoryAdapter(activity as Context, cateList )
        categoriesRecView.adapter = categoryAdapter


        return view
    }

    private fun setCategoryData() {
        cateList.add(Category("Clothing",R.drawable.circle_bg))
        cateList.add(Category("Jewelry",R.drawable.circle_bg))
        cateList.add(Category("Hair Accessories",R.drawable.circle_bg))
        cateList.add(Category("Costume Accessories",R.drawable.circle_bg))
        cateList.add(Category("Handbag & Wallet Accessories",R.drawable.circle_bg))
        cateList.add(Category("One-Pieces",R.drawable.circle_bg))
        cateList.add(Category("Masks",R.drawable.circle_bg))
        cateList.add(Category("Glasses",R.drawable.circle_bg))
        cateList.add(Category("Hobbies & Creative Arts",R.drawable.circle_bg))
        cateList.add(Category("Party & Celebration",R.drawable.circle_bg))
        cateList.add(Category("Baby Safety",R.drawable.circle_bg))
        cateList.add(Category("Nursing & Feeding",R.drawable.circle_bg))
        cateList.add(Category("Food Service Baskets",R.drawable.circle_bg))
        cateList.add(Category("Medical Equipment",R.drawable.circle_bg))
        cateList.add(Category("Piercing & Tattooing",R.drawable.circle_bg))
        cateList.add(Category("Science & Laboratory",R.drawable.circle_bg))
        cateList.add(Category("Camera & Optic Accessories",R.drawable.circle_bg))
        cateList.add(Category("Photography",R.drawable.circle_bg))
        cateList.add(Category("Audio Accessories",R.drawable.circle_bg))
        cateList.add(Category("Computer Components",R.drawable.circle_bg))
        cateList.add(Category("Bridges & Routers",R.drawable.circle_bg))
        cateList.add(Category("Beverages & Tobacco",R.drawable.circle_bg))
        cateList.add(Category("Kitchen & Dining",R.drawable.circle_bg))
        cateList.add(Category("Lawn & Garden",R.drawable.circle_bg))
        cateList.add(Category("Lighting",R.drawable.circle_bg))
        cateList.add(Category("Smoking Accessories",R.drawable.circle_bg))
        cateList.add(Category("Toys & Games",R.drawable.circle_bg))
        cateList.add(Category("Vehicles & Parts",R.drawable.circle_bg))
        cateList.add(Category("Video Accessories",R.drawable.circle_bg))
        cateList.add(Category("Circuit Boards & Components",R.drawable.circle_bg))
        cateList.add(Category("Sleepwear & Loungewear",R.drawable.circle_bg))

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

    private fun setCoverData() {

        val jsonFileString = context?.let {

            getJsonData(it, "CoverProducts.json")
        }
        val gson = Gson()

        val listCoverType = object : TypeToken<List<Product>>() {}.type

        var coverD: List<Product> = gson.fromJson(jsonFileString, listCoverType)

        coverD.forEachIndexed { idx, person ->
            coverProduct.add(person)

        }


    }


}


