package com.burhanrashid52.photoediting.functionality.ui.my_design_run_digital_compaign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.MyDesignRunDiditalCompaignFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class MyDesignRunDiditalCompaignFragment : Fragment() {

    private var _binding: MyDesignRunDiditalCompaignFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var viewModel: MyDesignRunDiditalCompaignFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = MyDesignRunDiditalCompaignFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        binding.submitCompaignBtn.setOnClickListener {
showBottomSheetDialog()
        }
        return root    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(requireActivity())
        bottomSheetDialog.setContentView(R.layout.submit_compaign_bottom_sheet)
        /*val copy = bottomSheetDialog.findViewById<LinearLayout>(R.id.copyLinearLayout)
        val share = bottomSheetDialog.findViewById<LinearLayout>(R.id.shareLinearLayout)
        val upload = bottomSheetDialog.findViewById<LinearLayout>(R.id.uploadLinearLayout)
        val download = bottomSheetDialog.findViewById<LinearLayout>(R.id.download)
        val delete = bottomSheetDialog.findViewById<LinearLayout>(R.id.delete)*/
        bottomSheetDialog.show()
    }

}