package com.androidcenter.viewpageronboarding.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import com.androidcenter.viewpageronboarding.MainActivity
import com.androidcenter.viewpageronboarding.R

class FinalPageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_final_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val startBtn=view.findViewById<AppCompatButton>(R.id.startBtn)

        startBtn.setOnClickListener {
            requireContext().startActivity(Intent(requireContext(),MainActivity::class.java))
            requireActivity().finish()
        }
    }
}