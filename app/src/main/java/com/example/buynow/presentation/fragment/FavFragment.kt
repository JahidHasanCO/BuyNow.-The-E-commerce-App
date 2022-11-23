package com.example.buynow.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.lottie.LottieAnimationView
import com.example.buynow.R


class FavFragment : Fragment() {

    lateinit var animationView: LottieAnimationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_fav, container, false)


        animationView = view.findViewById(R.id.animationViewFavPage)

        animationView.playAnimation()
        animationView.loop(true)

        return view
    }


}