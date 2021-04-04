package com.fighting.ppuz

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    fun next(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);
    }
}