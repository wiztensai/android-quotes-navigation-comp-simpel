package com.example.latihankotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihankotlin.databinding.FEinsteinBinding

class F_Einstein : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FEinsteinBinding.inflate(layoutInflater)

        bind.btnBiografi.setOnClickListener {
            findNavController().navigate(R.id.f_BiografiEinstein)
        }

        return bind.root
    }
}