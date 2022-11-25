package com.burhanrashid52.photoediting.functionality.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.burhanrashid52.photoediting.databinding.FragmentHomeBinding
import com.burhanrashid52.photoediting.functionality.CreateLogoActivity
import com.burhanrashid52.photoediting.functionality.CreatePosterActivity
import com.burhanrashid52.photoediting.functionality.DigitalCompaignActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/

        binding.createALogoLay.setOnClickListener {
            startActivity(Intent(requireActivity(), CreateLogoActivity::class.java))
        }
        binding.createADigitalLay.setOnClickListener {
            startActivity(Intent(requireActivity(), DigitalCompaignActivity::class.java))
        }
        binding.createAPosterLay.setOnClickListener {
            startActivity(Intent(requireActivity(), CreatePosterActivity::class.java))
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}