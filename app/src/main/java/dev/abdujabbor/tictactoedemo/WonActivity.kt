package dev.abdujabbor.tictactoedemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_won)
        val textViewWon = findViewById<TextView>(R.id.textViewWon)
        val player = intent.getStringExtra("player")
        if (player == "Tie") textViewWon.text = "TIE"
        else textViewWon.text = "$player WON"

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        textViewWon.startAnimation(anim)

        Handler().postDelayed({
            startActivity(Intent(this@WonActivity, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
