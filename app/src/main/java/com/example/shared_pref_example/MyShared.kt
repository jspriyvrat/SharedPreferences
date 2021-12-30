package com.example.shared_pref_example

import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings.Global.putString
import androidx.appcompat.app.AppCompatActivity

object  MyShared{

    lateinit var sharedPreferences: SharedPreferences

    fun setString(key: String, value: String,context: Context) {

        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.commit()
    }

    fun setInt(key: String, value: Int,context: Context) {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.commit()
    }

    fun setBool(key: String, value: Boolean,context: Context) {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.commit()
    }

    fun getStr(key: String,context: Context): String? {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.getString(key, "Data not found")
    }

    fun getInteger(key: String,context: Context): String? {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.getString(key, "Data not found")
    }

    fun getBool(key: String,context: Context): String? {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.getString(key, "Data not found")
    }

    fun notNull(key: String,context: Context): Boolean
    {
        sharedPreferences =context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.contains(key)
    }
}