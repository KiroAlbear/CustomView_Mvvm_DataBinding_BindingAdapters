package com.example.practiceandroid.customViews
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.practiceandroid.databinding.CustomEditeTextBinding
import com.example.practiceandroid.viewModels.CustomEditeTextViewModel

class CustomEditeText(context: Context,attrs:AttributeSet): ConstraintLayout(context,attrs) {
    var binding: CustomEditeTextBinding
    var vm :CustomEditeTextViewModel
    init {
        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        binding = CustomEditeTextBinding.inflate(inflater, this, true)
        vm = CustomEditeTextViewModel()
        binding.vm = vm
    }

}


