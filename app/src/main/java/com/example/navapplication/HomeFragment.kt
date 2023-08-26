package com.example.navapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navapplication.databinding.FragmentHomeBinding
import com.example.navapplication.databinding.FragmentHotelBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHotelBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        val root: View = binding.root

        _binding!!.texttv.text="Play"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}