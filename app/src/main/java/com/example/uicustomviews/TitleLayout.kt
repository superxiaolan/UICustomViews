package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.example.uicustomviews.databinding.TitleBinding

//import kotlinx.android.synthetic.main.title.view.*

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    private lateinit var titleBinding: TitleBinding //ActivityMainBinding就是activity_main.xml生成的绑定文件
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        titleBinding.titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        titleBinding.titleEdit.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }

}