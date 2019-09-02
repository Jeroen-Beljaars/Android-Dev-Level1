package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*

class LogicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)

        btnSubmit.setOnClickListener {
            this.checkAnswers()
        }
    }

    /**
     * Check if the user entered correct values
     */
    private fun checkAnswers(){
        if (tvRow1.text.toString().toUpperCase() == "T" &&
            tvRow2.text.toString().toUpperCase() == "F" &&
            tvRow3.text.toString().toUpperCase() == "F" &&
            tvRow4.text.toString().toUpperCase() == "F") {
            Toast.makeText(this,  getString(R.string.correct), Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this,  getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
        }

    }
}
