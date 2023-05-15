package com.example.agripure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchOnOff:Switch=findViewById(R.id.switchOnOff)


        switchOnOff.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked){
                val fragmentSignIn = SignInFragment()
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container_login, fragmentSignIn)
                    commit()
                }
            }
            else{
                val loginFragment = LoginFragment()
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment_container_login, loginFragment)
                    commit()
                }
            }
        }


    }
}