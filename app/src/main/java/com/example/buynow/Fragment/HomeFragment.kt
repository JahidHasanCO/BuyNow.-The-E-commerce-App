package com.example.buynow.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.buynow.Adapter.ProductAdapter
import com.example.buynow.Model.Product
import com.example.buynow.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject

import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext


class HomeFragment : Fragment() {

    private val bannerCollectionRef = Firebase.firestore.collection("Banner")
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()

    lateinit var newProductRecView: RecyclerView
    lateinit var saleProductRecView: RecyclerView

    lateinit var productAdapter: ProductAdapter
    lateinit var saleProductAdapter: ProductAdapter

    lateinit var productList: ArrayList<Product>
    lateinit var saleProductList: ArrayList<Product>

    private val productRef = Firebase.firestore.collection("Products")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        productList = arrayListOf()
        saleProductList = arrayListOf()
        ProductLoadListner()

        newProductRecView = view.findViewById(R.id.newProductRecView)
        newProductRecView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
        newProductRecView.setHasFixedSize(true)
        productAdapter = ProductAdapter(productList, activity as Context)
        newProductRecView.adapter = productAdapter

        saleProductRecView = view.findViewById(R.id.saleProductRecView)
        saleProductRecView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false)
        saleProductRecView.setHasFixedSize(true)
        saleProductAdapter = ProductAdapter(saleProductList, activity as Context)
        saleProductRecView.adapter = saleProductAdapter



        return view
    }

    public fun ProductLoadListner() = CoroutineScope(Dispatchers.Main).launch {

        try {

            val querySnapshot = productRef
                .get().await()
            for (doc in querySnapshot.documents){

                saleProductList.add(doc.toObject<Product>()!!)
                productList.add(doc.toObject<Product>()!!)
//                if(doc.toObject<Product>()!!.productHave == true){
//                    saleProductList.add(doc.toObject<Product>()!!)
//                }
//                else{
//                    productList.add(doc.toObject<Product>()!!)
//                }

            }

        }catch (e:Exception){

                Toast.makeText(context,e.message,Toast.LENGTH_SHORT).show()

        }
        productAdapter.notifyDataSetChanged()

    }

}


