package com.example.fragment_implementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // taking instance of the fragment class
        val firstfragment = Fragment_first()
        val secondfragment = Fragment_second()


        // to set the initial fragment in the frame layout
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.Fl_fragment, firstfragment)
            commit()
        }

        // now the functionality of buttons

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.Fl_fragment, firstfragment)
                commit()
            }
            button2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.Fl_fragment, secondfragment)
                    commit()
                }

            }
        }
    }
}