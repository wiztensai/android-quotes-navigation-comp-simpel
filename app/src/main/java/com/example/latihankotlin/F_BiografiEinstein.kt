package com.example.latihankotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihankotlin.databinding.FBiografiEinsteinBinding

class F_BiografiEinstein : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FBiografiEinsteinBinding.inflate(layoutInflater)

        bind.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return bind.root
    }
}