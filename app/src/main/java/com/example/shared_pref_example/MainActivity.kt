package com.example.shared_pref_example

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shared_pref_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
          binding.savebutton.setOnClickListener {

                MyShared.setString("Email",binding.mymail.text.toString(),this)
                MyShared.setString("Password",binding.password.text.toString(),this)
                    binding.mymail.text.clear()
                    binding.password.text.clear()

            }
        binding.sowbtn.setOnClickListener {
            if (MyShared.notNull("Email",this)&& MyShared.notNull("Password",this))
            {
                binding.txtemail.text = MyShared.getStr("Email",this)
                binding.textpassword.text =MyShared.getStr("Password",this)
            }
        }

    }
}