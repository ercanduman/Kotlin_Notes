package ercanduman.kotlinnotes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val > final (immutable, unchangeable, read-only) variables
        val name: String = "Ercan";

        // var > changable variables | ;(semi-colons) are free, not necessary in Kotlin
        var age: Int = 27;

        //variables can be defined without declaring its type
        val username = "ercanduman" // this is a String variable

        // Strings can be used as string interpolation
        // which means you can use variables inside a text as shown below
        var myText = name + " is $age years old"


        //setting test to textviews
        textview_text.setText("First Kotlin app")

        // button clicks handled easily and very readable
        button.setOnClickListener { textview_text.setText(myText) }
    }
}
