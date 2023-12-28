package com.example.datapass1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.datapass1.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding :ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val myfragment = Bmifragment()
        val fm :FragmentManager = supportFragmentManager
        val ft:FragmentTransaction = fm.beginTransaction()
        binding.cal.setOnClickListener {
            val result:Double = binding.weight.text.toString().toDouble()/binding.height.text.toString().toDouble()
            val bundle = Bundle()
bundle.putDouble("result",result)
  myfragment.arguments = bundle
ft.add(R.id.frame,myfragment).commit()
binding.buttonnext.isVisible = true
        }

        binding.buttonnext.setOnClickListener {

         }
    }

}





