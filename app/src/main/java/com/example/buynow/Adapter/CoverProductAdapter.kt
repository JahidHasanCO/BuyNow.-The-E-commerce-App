package com.example.buynow.Adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.buynow.Model.Product
import com.example.buynow.ProductDetailsActivity
import com.example.buynow.R

class CoverProductAdapter(var ctx: Context, private val coverProductList: ArrayList<Product>) :RecyclerView.Adapter<CoverProductAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val productView = LayoutInflater.from(parent.context).inflate(R.layout.cover_single,parent,false)
        return CoverProductAdapter.ViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



        val coverPro:Product = coverProductList[position]

        holder.productNoteCover.text = coverPro.productNote
        Glide.with(ctx)
            .load(coverPro.productImage)
            .into(holder.productImage_coverPage)


        holder.productCheck_coverPage.setOnClickListener {

            goDetailsPage(position)


        }

    }




    override fun getItemCount(): Int {
        return coverProductList.size
    }

    public class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val productImage_coverPage: ImageView = itemView.findViewById(R.id.productImage_coverPage)
        val productNoteCover: TextView = itemView.findViewById(R.id.productNoteCover)
        val productCheck_coverPage: Button = itemView.findViewById(R.id.productCheck_coverPage)


    }

    private fun goDetailsPage(position: Int) {
        val intent = Intent(ctx , ProductDetailsActivity::class.java)
        intent.putExtra("ProductIndex", position)
        intent.putExtra("ProductFrom", "Cover")
        ctx.startActivity(intent)
    }
}