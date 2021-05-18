package com.firstapp.davaleba5.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.firstapp.davaleba5.R

class homefragment: Fragment(R.layout.fragment_home) {
    private  lateinit var editText:EditText
    private lateinit var button:Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editTextTextAmount)
        button.setOnClickListener(){
            var amount = -1
            if(editText.text.isNotEmpty()){
                amount=editText.text.toString().toInt()
            }
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)
            navController.navigate(action)
        }


    }
}