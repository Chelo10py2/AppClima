package com.example.appclima

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.appclima.ciudades.CIUDAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bAsuncion = findViewById<Button>(R.id.bAsuncion)
        val bCde = findViewById<Button>(R.id.bCde)

        bAsuncion.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-asuncion")
            startActivity(intent)
        })

        bCde.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-cde")
            startActivity(intent)
        })
    }
}