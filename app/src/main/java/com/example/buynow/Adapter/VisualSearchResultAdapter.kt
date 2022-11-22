package com.example.buynow.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.buynow.Model.Product
import com.example.buynow.R

class VisualSearchResultAdapter(private val productList: ArrayList<Product>, context: Context) :  RecyclerView.Adapter<VisualSearchResultAdapter.visualViewHolder>(){


    val ctx: Context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): visualViewHolder {
        val productView = LayoutInflater.from(parent.context).inflate(R.layout.predicted_result_single,parent,false)
        return VisualSearchResultAdapter.visualViewHolder(productView)
    }

    override fun onBindViewHolder(holder: visualViewHolder, position: Int) {

        val product: Product = productList[position]
        holder.productBrandName_singleProduct.text = product.productBrand
        holder.productName_singleProduct.text = product.productName
        holder.productPrice_singleProduct.text = "$"+product.productPrice
        holder.productRating_singleProduct.rating = product.productRating

        Glide.with(ctx)
            .load(product.productImage)
            .placeholder(R.drawable.bn)
            .into(holder.productImage_singleProduct)


        if(product.productHave == true){
            holder.discountTv_singleProduct.text = product.productDisCount
            holder.discount_singleProduct.visibility = View.VISIBLE
        }

        if(product.productHave == false){

            holder.discount_singleProduct.visibility = View.VISIBLE
            holder.discountTv_singleProduct.text = "New"

        }


    }

    override fun getItemCount(): Int {
        return productList.size
    }


    public class visualViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val productImage_singleProduct: ImageView = itemView.findViewById(R.id.productImage_predictProduct)
        val productAddToFav_singleProduct: ImageView = itemView.findViewById(R.id.productAddToFav_predictProduct)
        val productRating_singleProduct: RatingBar = itemView.findViewById(R.id.productRating_predictProduct)
        val productBrandName_singleProduct: TextView = itemView.findViewById(R.id.productBrandName_predictProduct)
        val discountTv_singleProduct: TextView = itemView.findViewById(R.id.discountTv_predictProduct)
        val productName_singleProduct: TextView = itemView.findViewById(R.id.productName_predictProduct)
        val productPrice_singleProduct: TextView = itemView.findViewById(R.id.productPrice_predictProduct)
        val discount_singleProduct = itemView.findViewById<LinearLayout>(R.id.discount_predictProduct)


    }
}