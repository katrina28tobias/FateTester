package com.menaces.fatetester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val narrationButton: Button = findViewById(R.id.button_1)
        narrationButton.setOnClickListener {
            replaceFragment1()
        }

        val choicesButton: Button = findViewById(R.id.button_2)
        choicesButton.setOnClickListener {
            replaceFragment2()
        }

    }

    private fun replaceFragment2() {
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.choices_fragment, Fragment(R.layout.fragment_narration))
    }

    private fun replaceFragment1() {
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.button_1, Fragment(R.layout.fragment_narration))
        ft.show(Fragment(R.layout.fragment_narration))
        setContentView(R.layout.fragment_narration)
    }
}