package com.example.datapass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.datapass1.databinding.ActivityFragToFragBinding

class FragToFrag : AppCompatActivity() {
   private lateinit var  binding:ActivityFragToFragBinding
   private  lateinit var  btn:Button
   private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFragToFragBinding.inflate(layoutInflater)
        btn = findViewById(R.id.pressbtn)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fm :FragmentManager = supportFragmentManager
        val ft:FragmentTransaction = fm.beginTransaction()
        val frag1 = Frag1()
        val frag2 = Frag2()
        ft.add(R.id.frame2,frag2)
        ft.add(R.id.frame1,frag1)
        ft.commit()

        btn.setOnClickListener {
           count++
            passdata(count)
        }
    }
    private fun passdata (count:Int){
        val bundle = Bundle ()
        val frag2 = Frag2 ()
        bundle.putInt("Count",count)
        frag2.arguments = bundle

    }
}