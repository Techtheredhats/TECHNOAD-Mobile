package com.burhanrashid52.photoediting.functionality.ui.add_style_text

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.burhanrashid52.photoediting.R
import com.burhanrashid52.photoediting.databinding.FragmentAddStyleTextBinding


class AddStyleTextFragment : Fragment() {

private var _binding: FragmentAddStyleTextBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?,
  ): View {
    val notificationsViewModel =
            ViewModelProvider(this).get(AddStyleTextViewModel::class.java)

    _binding = FragmentAddStyleTextBinding.inflate(inflater, container, false)
    val root: View = binding.root

    /*val textView: TextView = binding.textNotifications
    notificationsViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }*/
      showDialog()
    return root
  }

        fun showDialog() {
            val dialog = Dialog(requireActivity())
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.add_text_dialogue)
            val dialogButton: Button = dialog.findViewById(R.id.cancel) as Button
            dialogButton.setOnClickListener(View.OnClickListener { dialog.dismiss() })
            /*val text = dialog.findViewById(R.id.add_text_dialogue) as TextView
            text.text = msg
            val dialogButton: Button = dialog.findViewById(R.id.btn_dialog) as Button
            dialogButton.setOnClickListener(View.OnClickListener { dialog.dismiss() })*/
            dialog.show()
        }


override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}