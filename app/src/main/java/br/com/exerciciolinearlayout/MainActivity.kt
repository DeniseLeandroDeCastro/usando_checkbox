package br.com.exerciciolinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkColor.setOnClickListener {
            if(checkColor.isChecked) {
                imageColor.setColorFilter(resources.getColor(R.color.green))
            } else {
                imageColor.setColorFilter(resources.getColor(R.color.black))
            }
        }
    }
}