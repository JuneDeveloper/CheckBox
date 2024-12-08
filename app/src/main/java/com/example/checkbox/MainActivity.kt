package com.example.checkbox

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textTV:TextView

    private lateinit var checkBoxCB: CheckBox

    private lateinit var textOutputTV:TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTV = findViewById(R.id.textTV)
        textOutputTV = findViewById(R.id.textOutputTV)
        checkBoxCB = findViewById(R.id.checkBoxCB)

        checkBoxCB.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                textTV.text = "Правила дорожного движения"
                textOutputTV.text = "1.Переходи дорогу в положенном месте\n" +
                                    "2.Пользуйся светофором и зеброй\n" +
                                    "3.Не кури в общественном туалете"
            }
            else {
                textTV.text = "Информация"
                textOutputTV.text = ""
            }
        }
    }
}