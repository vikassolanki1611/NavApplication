package com.example.navapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navapplication.databinding.FragmentCabBinding
import com.example.navapplication.databinding.FragmentMallBinding

class MallFragment : Fragment() {

    private var _binding: FragmentMallBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMallBinding.inflate(inflater, container, false)
        val root: View = binding.root

        _binding!!.texttv.text="CV Mall"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}