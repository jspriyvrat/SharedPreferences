package com.example.shared_pref_example

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shared_pref_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var obj:MyShared
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        obj=MyShared(this)


            binding.savebutton.setOnClickListener {

                    obj.setString("Email",binding.mymail.text.toString())
                    obj.setString("Password",binding.password.text.toString())
                    binding.mymail.text.clear()
                    binding.password.text.clear()

            }
        binding.sowbtn.setOnClickListener {
            if (obj.notNull("Email")&& obj.notNull("Password"))
            {
                binding.txtemail.text = obj.getStr("Email")
                binding.textpassword.text =obj.getStr("Password")
            }
        }

    }
}