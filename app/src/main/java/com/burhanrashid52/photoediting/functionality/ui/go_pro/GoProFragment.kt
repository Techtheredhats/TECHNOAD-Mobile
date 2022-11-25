package com.burhanrashid52.photoediting.functionality.ui.go_pro

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.burhanrashid52.photoediting.R

class GoProFragment : Fragment() {

    companion object {
        fun newInstance() = GoProFragment()
    }

    private lateinit var viewModel: GoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.go_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}