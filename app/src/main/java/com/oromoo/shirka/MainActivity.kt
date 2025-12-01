package com.oromoo.shirka

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    private val stories = listOf(
        "📖 Oromoo Oral Tradition (Shirka)\n\nStories passed through generations teaching values, history, and cultural wisdom.",
        
        "⚖️ Gadaa System\n\nDemocratic governance of Oromoo people with 8-year leadership cycles.",
        
        "🙏 Waaqeffannaa\n\nTraditional monotheistic religion of Oromoo people.",
        
        "🌾 Irreecha Festival\n\nThanksgiving festival celebrated at end of rainy season.",
        
        "🔤 Afaan Oromoo\n\nWidely spoken African language written with Qubee script.",
        
        "🇪🇹 Oromia\n\nHomeland of Oromoo people in Ethiopia and Kenya."
    )
    
    private var currentStoryIndex = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val storyText = findViewById<TextView>(R.id.storyText)
        val nextButton = findViewById<Button>(R.id.nextButton)
        
        storyText.text = stories[0]
        
        nextButton.setOnClickListener {
            currentStoryIndex = (currentStoryIndex + 1) % stories.size
            storyText.text = stories[currentStoryIndex]
        }
    }
}
