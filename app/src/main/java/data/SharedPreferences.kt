package data

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(private var context: Context) {
    private val sharedPreferences:SharedPreferences by lazy {
        context.getSharedPreferences("mi_data",Context.MODE_PRIVATE)
    }
    fun saveUser(user:String){
        var editor = sharedPreferences.edit()
        editor.putString("keyUserPref",user)
        editor.apply()
    }

    fun getUser():String{
        return sharedPreferences.getString("keyUserPref","Empty").toString()
    }
}