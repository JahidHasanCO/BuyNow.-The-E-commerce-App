package com.example.buynow.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.buynow.Model.Product
import com.example.buynow.R
import com.example.buynow.db.ProductEntity

class CartAdapter(private val ctx: Context, val listener:CartItemClickAdapter ):RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val cartList: ArrayList<ProductEntity> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val cartView = LayoutInflater.from(ctx).inflate(R.layout.cart_item_single,parent,false)

        return CartViewHolder(cartView)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {


        val cartItem:ProductEntity = cartList[position]

        holder.cartName.text = cartItem.name
        holder.cartPrice.text = "$"+ cartItem.price
        holder.quantityTvCart.text = cartItem.qua.toString()
        holder.cartMore.setOnClickListener {

        }

        Glide.with(ctx)
            .load(cartItem.Image)
            .into(holder.cartImage)

        holder.cartMore.setOnClickListener {
            listener.onItemDeleteClick(cartItem)
        }
    }

    override fun getItemCount(): Int {
        return cartList.size
    }



    public class CartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val cartImage: ImageView = itemView.findViewById(R.id.cartImage)
        val cartMore: ImageView = itemView.findViewById(R.id.cartMore)
        val cartName: TextView = itemView.findViewById(R.id.cartName)
        val cartPrice: TextView = itemView.findViewById(R.id.cartPrice)
        val quantityTvCart: TextView = itemView.findViewById(R.id.quantityTvCart)


    }

    fun updateList(newList: List<ProductEntity>){
        cartList.clear()
        cartList.addAll(newList)
        notifyDataSetChanged()
    }


}

interface CartItemClickAdapter{
    fun onItemDeleteClick(product: ProductEntity)
    fun onItemUpdateClick(product: ProductEntity)


}