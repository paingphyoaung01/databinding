package com.ppa.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ppa.newproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnSub.setOnClickListener {
            var name = binding.edtname.text.toString()
            var occ = binding.edtocc.text.toString()
            var paing:NewProject = Newproject(name,occ)
            binding.first = paing
        }
    }
}
