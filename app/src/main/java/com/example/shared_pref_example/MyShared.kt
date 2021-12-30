package com.example.shared_pref_example

import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings.Global.putString
import androidx.appcompat.app.AppCompatActivity

class MyShared(val context:Context) {
    lateinit var sharedPreferences: SharedPreferences

    fun setString(key: String, value: String) {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.commit()
    }

    fun setInt(key: String, value: Int) {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.commit()
    }

    fun setBool(key: String, value: Boolean) {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.commit()
    }

    fun getStr(key: String): String? {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.getString(key, "Data not found")
    }

    fun getInteger(key: String): String? {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.getString(key, "Data not found")
    }

    fun getBool(key: String): String? {
        sharedPreferences =
            context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.getString(key, "Data not found")
    }

    fun notNull(key: String): Boolean
    {
        sharedPreferences =context.getSharedPreferences("userDetails", AppCompatActivity.MODE_PRIVATE)
        return sharedPreferences.contains(key)
    }
}