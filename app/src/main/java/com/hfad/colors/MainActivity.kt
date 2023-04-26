package com.hfad.colors

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var redChannel: EditText
    private lateinit var greenChannel: EditText
    private lateinit var blueChannel: EditText
    private lateinit var generateButton: Button
    private lateinit var outputPanel: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        redChannel = findViewById(R.id.red_channel)
        greenChannel = findViewById(R.id.green_channel)
        blueChannel = findViewById(R.id.blue_channel)
        generateButton = findViewById(R.id.generate_button)
        outputPanel = findViewById(R.id.output_panel)
        generateButton.setOnClickListener {

            if (redChannel.text.isNotEmpty() && greenChannel.text.isNotEmpty() && blueChannel.text.isNotEmpty()) {
                outputPanel.apply {
                    text = getString(R.string.output_panel_text)
                    outputPanel.setBackgroundColor(
                        Color.parseColor(
                            "#${redChannel.text}${blueChannel.text}${greenChannel.text}"
                        )
                    )
                }
            } else {
                Toast.makeText(this, "Enter valid color values", Toast.LENGTH_SHORT).show()
            }

        }
    }
}