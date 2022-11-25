package com.burhanrashid52.photoediting.functionality.ui.save_logo

import android.app.Dialog
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.SaveLogoFragmentBinding


class SaveLogoFragment : Fragment() {

    private var _binding: SaveLogoFragmentBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var viewModel: SaveLogoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = SaveLogoFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        showDialogue()
        return root
    }

    private fun showDialogue() {
        val dialog = Dialog(requireActivity())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.save_logo_dialogue)
        /*val text = dialog.findViewById(R.id.add_text_dialogue) as TextView
        text.text = msg*/
        val dialogButton: Button = dialog.findViewById(R.id.save_logo) as Button
        dialogButton.setOnClickListener(View.OnClickListener { dialog.dismiss() })
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.getWindow()?.getAttributes())
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        val width = (resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog.show()
        dialog.getWindow()?.setAttributes(lp);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SaveLogoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}