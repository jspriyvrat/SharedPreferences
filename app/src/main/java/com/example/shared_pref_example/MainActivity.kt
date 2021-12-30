package com.example.shared_pref_example

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shared_pref_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

            sharedPreferences=getSharedPreferences("userDetails", MODE_PRIVATE)

            binding.savebutton.setOnClickListener {
                val  editor:SharedPreferences.Editor=sharedPreferences.edit()
                with(editor) {
                    putString("Email",binding.mymail.text.toString())
                    putString("Password",binding.password.text.toString())
                    commit()
                    binding.mymail.text.clear()
                    binding.password.text.clear()
                }

            }
        binding.sowbtn.setOnClickListener {
            if (sharedPreferences.contains("Email")&& sharedPreferences.contains("Password"))
            {
                binding.txtemail.text = sharedPreferences.getString("Email","Data not found")
                binding.textpassword.text = sharedPreferences.getString("Password","Data not found")
            }
        }

    }
}