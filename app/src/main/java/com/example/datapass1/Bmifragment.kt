package com.example.datapass1
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Bmifragment : Fragment() {

 private   lateinit var  textview :TextView
    @SuppressLint("SetTextI18n")
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_bmifragment, container, false)
textview =view.findViewById(R.id.textviewfram_id)
val result:Double = arguments?.getDouble("result")!!.toDouble()

        /*
        below 18.5 – you're in the underweight range
between 18.5 and 24.9 – you're in the healthy weight range
between 25 and 29.9 – you're in the overweight range
30 or over – you're in the obese range*/

        if (result<18.5){
            textview.text = " Ans :${result.toFloat()}\nbelow 18.5 – you're in the underweight range"
        }  else
        if (result in 18.5..24.9) {
            textview.text = " Ans :${result.toFloat()}\nbetween 18.5 and 24.9 – you're in the healthy weight range"
        }else {
textview.text = " Ans :${result.toFloat()}\n30 or over – you're in the obese range"
        }

        return view
    }


}