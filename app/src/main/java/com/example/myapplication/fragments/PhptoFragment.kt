package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class PhptoFragment: Fragment(R.layout.fragment_photo) {
    private lateinit var butto:Button
    private lateinit var texttT:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        butto = view.findViewById(R.id.button2)
        texttT = view.findViewById(R.id.textView2)
        butto.setOnClickListener {
            val name = texttT.text.toString()
            val action = PhptoFragmentDirections.actionPhptoFragmentToHomeFragment(name)
            findNavController().navigate(action)
        }
    }

}