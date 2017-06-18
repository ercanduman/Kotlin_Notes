package ercanduman.kotlinnotes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview_text.setText("First Kotlin app")

        button.setOnClickListener { textview_text.setText("Button clicked!") }
    }
}
