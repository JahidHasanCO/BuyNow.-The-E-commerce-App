package com.example.buynow.Adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.buynow.Model.Product
import com.example.buynow.R

class ProductAdapter(private val productList: ArrayList<Product>, context: Context): RecyclerView.Adapter<ProductAdapter.ViewHolder>()  {

    val ctx: Context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {

        val productView = LayoutInflater.from(parent.context).inflate(R.layout.single_product,parent,false)
        return ViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {

        val product: Product = productList[position]
        holder.productBrandName_singleProduct.text = product.productBrand
        holder.productName_singleProduct.text = product.productName
        holder.productPrice_singleProduct.text = product.productPrice
        holder.productRating_singleProduct.rating = product.productRating

        Glide.with(ctx)
            .load(product.productImage)
            .placeholder(R.drawable.bn)
            .into(holder.productImage_singleProduct)



    }

    override fun getItemCount(): Int {
         return productList.size
    }

    public class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val productImage_singleProduct:ImageView = itemView.findViewById(R.id.productImage_singleProduct)
        val productAddToFav_singleProduct:ImageView = itemView.findViewById(R.id.productAddToFav_singleProduct)
        val productRating_singleProduct:RatingBar = itemView.findViewById(R.id.productRating_singleProduct)
        val productBrandName_singleProduct:TextView = itemView.findViewById(R.id.productBrandName_singleProduct)
        val productName_singleProduct:TextView = itemView.findViewById(R.id.productName_singleProduct)
        val productPrice_singleProduct:TextView = itemView.findViewById(R.id.productPrice_singleProduct)


    }
}