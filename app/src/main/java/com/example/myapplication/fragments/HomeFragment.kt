package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class HomeFragment:Fragment(R.layout.fragment_home) {
    private lateinit var something:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        something = view.findViewById(R.id.textView3)
        view.findViewById<TextView>(R.id.textView3).text = HomeFragmentArgs.fromBundle(requireArguments()).name
        val idk = something.text.toString()
        if(idk.isEmpty()){
            something.text = "You Free today?"
        }
    }


}