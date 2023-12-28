package com.example.datapass1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Frag1 : Fragment() {
private  lateinit var  btn:Button

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
 return   inflater.inflate(R.layout.fragment_frag1, container, false)


    }


}