package com.example.datapass1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Frag2 : Fragment() {
private  lateinit var  textview:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
      val view :View =  inflater.inflate(R.layout.fragment_frag2, container, false)
        textview = view.findViewById(R.id.mytextviewx)
        val count = arguments?.getInt("Count").toString()
        textview.text = count
      return  view
    }
}