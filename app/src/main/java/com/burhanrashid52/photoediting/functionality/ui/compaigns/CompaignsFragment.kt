package com.burhanrashid52.photoediting.functionality.ui.compaigns

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.burhanrashid52.photoediting.functionality.DigitalCompaignActivity
import com.burhanrashid52.photoediting.databinding.FragmentCompaignBinding

class CompaignsFragment : Fragment() {

    private var _binding: FragmentCompaignBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(CompaignsViewModel::class.java)

        _binding = FragmentCompaignBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        binding.compaignItem.setOnClickListener {
            startActivity(Intent(requireActivity() , DigitalCompaignActivity::class.java))
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}