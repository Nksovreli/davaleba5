package com.firstapp.davaleba5.fragments

import androidx.fragment.app.Fragment
import com.firstapp.davaleba5.R

class dashboardFragment:Fragment(R.layout.fragment_desh) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
                dashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()
}