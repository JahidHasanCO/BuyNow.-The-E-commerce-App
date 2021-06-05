package com.example.buynow.Fragment

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buynow.Adapter.CartAdapter
import com.example.buynow.Adapter.CartItemClickAdapter

import com.example.buynow.R


import com.example.buynow.db.CartViewModel
import com.example.buynow.db.ProductEntity
import java.io.ObjectOutputStream
import kotlin.math.log


class BagFragment : Fragment(), CartItemClickAdapter {

    lateinit var cartRecView:RecyclerView
    lateinit var cartAdapter: CartAdapter

     var sum:Int = 0

    private lateinit var cartViewModel: CartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_bag, container, false)

        cartRecView = view.findViewById(R.id.cartRecView)


        cartRecView.layoutManager = LinearLayoutManager(context)
        cartAdapter = CartAdapter(activity as Context, this )
        cartRecView.adapter = cartAdapter


        cartViewModel = ViewModelProviders.of(this).get(CartViewModel::class.java)

        cartViewModel.allproducts.observe(viewLifecycleOwner, Observer {List ->
            List?.let {
                cartAdapter.updateList(it)

            }

            List?.let {
                it.forEach {
                    sum += it.price
                }

            }

        })

        Toast.makeText(context, "Total Price: "+sum, Toast.LENGTH_SHORT).show()


        return view
    }

    override fun onItemDeleteClick(product: ProductEntity) {
        cartViewModel.deleteCart(product)
    }

    override fun onItemUpdateClick(product: ProductEntity) {
        cartViewModel.updateCart(product)
    }


}