package com.menaces.fatetester

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Narration(var layoutInflater: View) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        layoutInflater = inflater.inflate(R.layout.fragment_choices, container, false)
        return layoutInflater
    }
}