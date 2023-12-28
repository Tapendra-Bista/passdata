package com.example.datapass1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datapass1.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private  lateinit var  binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name:String = intent.getStringExtra("name").toString()
        val email:String = intent.getStringExtra("email").toString()
        val phone:String = intent.getStringExtra("phone").toString()
        "Your name is $name,$email is your email address and phone number is $phone.".also { binding.textview2.text = it }
        binding.bmi.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}