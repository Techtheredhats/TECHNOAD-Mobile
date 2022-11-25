package com.burhanrashid52.photoediting.functionality.ui.select_logo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.burhanrashid52.photoediting.editor.EditImageActivity
import com.burhanrashid52.photoediting.databinding.SelectLogoFragmentBinding

class SelectLogoFragment : Fragment() {

    private var _binding: SelectLogoFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = SelectLogoFragment()
    }

    private lateinit var viewModel: SelectLogoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = SelectLogoFragmentBinding.inflate(inflater, container, false)

        binding.createPoster.setOnClickListener {
            startActivity(Intent(requireActivity(), EditImageActivity::class.java))
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SelectLogoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}