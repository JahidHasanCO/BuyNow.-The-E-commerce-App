package com.example.buynow.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.buynow.R
import com.example.buynow.db.Card.CardEntity
import com.example.buynow.db.ProductEntity

class CardAdapter(private val ctx: Context, val listener:CarDItemClickAdapter) :RecyclerView.Adapter<CardAdapter.cardViewHolder>() {

    private val cardList: ArrayList<CardEntity> = arrayListOf()

    public class cardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){


        val cardNumber: TextView = itemView.findViewById(R.id.cardNumber_singleCard)
        val cardHName: TextView = itemView.findViewById(R.id.cardHolderName_singleCard)
        val exp: TextView = itemView.findViewById(R.id.expiryDate_singleCard)
        val layD : LinearLayout = itemView.findViewById(R.id.useDefault_Layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewHolder {
        val cardView = LayoutInflater.from(ctx).inflate(R.layout.single_card,parent,false)

        return cardViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: cardViewHolder, position: Int) {
        val cardItem:CardEntity = cardList[position]

        holder.cardHName.text = cardItem.nameCH.toString()
        holder.exp.text = cardItem.exp
//        holder.cardNumber.text = "**** **** **** "+ cardItem.number[cardItem.number.length - 4] + cardItem.number[cardItem.number.length - 3] + cardItem.number[cardItem.number.length - 2] + cardItem.number[cardItem.number.length - 1 ]

        if(cardList.size > 1){
            holder.layD.visibility = View.VISIBLE
        }
        else{
            holder.layD.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    fun updateList(newList: List<CardEntity>){
        cardList.clear()
        cardList.addAll(newList)
        notifyDataSetChanged()
    }
}


interface CarDItemClickAdapter{
    fun onItemDeleteClick(cardEntity: CardEntity)
    fun onItemUpdateClick(cardEntity: CardEntity)
}