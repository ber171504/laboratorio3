package com.example.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val ant = "1"
    val tik = "2"
    val ati= "3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = false
        var nameEdit = ""

        Estrellita.setOnClickListener{
            name = !name
            if(name == true){
                nameEdit = editText.text.toString()
                textView2.text = nameEdit
                textView.visibility = View.GONE
                textView2.visibility = View.VISIBLE
                editText.visibility = View.GONE
            }
            else {
                textView.visibility = View.VISIBLE
                textView2.visibility = View.GONE
                editText.visibility = View.VISIBLE
            }
        }
        antiguaInfo.setOnClickListener{
            val intent = Intent (this, InfoView::class.java).apply {
                putExtra("lugar",ant)
            }
            startActivity(intent)
        }
        tikalInfo.setOnClickListener{
            val intent = Intent (this, InfoView::class.java).apply {
                putExtra("lugar",tik)
            }
            startActivity(intent)
        }
        atiInfo.setOnClickListener{
            val intent = Intent (this, InfoView::class.java).apply {
                putExtra("lugar",ati)
            }
            startActivity(intent)
        }

    }
}
