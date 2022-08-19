package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*       var textField = findViewById<TextInputLayout>(R.id.textField)
               textField.setEndIconOnClickListener {
                   Toast.makeText(this, "salam eshghm", Toast.LENGTH_SHORT).show()
               }

               textField.addOnEditTextAttachedListener {

               }

         */
        var textField = findViewById<TextInputLayout>(R.id.textFiled)
        var outlinedTextField = findViewById<TextInputLayout>(R.id.outlinedTextField)

        val items = listOf("Material", "Design", "Components", "Android")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        (textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)
        val inputText = outlinedTextField.editText?.text.toString()

        outlinedTextField.editText?.doOnTextChanged { inputText, _, _, _ ->
            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
        }

    }
}


