package com.example.datapass1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datapass1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding  = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
      binding.button1.setOnClickListener{
          val intent = Intent(this@MainActivity,MainActivity2::class.java)
          val name:String = binding.nameId.text.toString()
          val email:String = binding.emailId.text.toString()
          val phone:String = binding.phoneId.text.toString()
          intent.putExtra("name",name)
          intent.putExtra("email",email)
          intent.putExtra("phone",phone)
          startActivity(intent)
      }

    }
}