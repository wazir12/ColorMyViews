package com.lwazir.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }
    private fun setListener(){
        val clickableViews: List<View> =
            listOf(box_text_one, box_two_text, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                red_button, green_button, yellow_button)
        for(item  in clickableViews)
        {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(it: View?) {
        when(it?.id)
        {
            // Boxes using Color class colors for background
            R.id.box_text_one -> it.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> it.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.green)

            else -> it?.setBackgroundColor(Color.LTGRAY)
        }
    }
}
