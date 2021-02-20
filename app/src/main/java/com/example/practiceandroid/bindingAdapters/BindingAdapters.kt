package com.example.practiceandroid
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.BindingAdapter


@BindingAdapter("app:textChangedListener","app:validateBar1")
fun onTextChanged(et: EditText,textView: TextView,textView2: TextView) {
    et.addTextChangedListener(object : TextWatcher {
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

        }
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun afterTextChanged(s: Editable) {

            if (et.text.toString().contains("4")) {
                textView.visibility = View.VISIBLE
            }else
                textView.visibility = View.GONE

            if (et.text.toString().contains("5")) {
                textView2.visibility = View.VISIBLE
            }else
                textView2.visibility = View.GONE
        }
    })
}

