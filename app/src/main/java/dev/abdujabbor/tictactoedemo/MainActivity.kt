package dev.abdujabbor.tictactoedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)
        var chance = "X"
        var board = arrayListOf<String>("", "", "", "", "", "", "", "", "")
        var button0 = findViewById<ImageView>(R.id.button0)
        var button1 = findViewById<ImageView>(R.id.button1)
        var button2 = findViewById<ImageView>(R.id.button2)
        var button3 = findViewById<ImageView>(R.id.button3)
        var button4 = findViewById<ImageView>(R.id.button4)
        var button5 = findViewById<ImageView>(R.id.button5)
        var button6 = findViewById<ImageView>(R.id.button6)
        var button7 = findViewById<ImageView>(R.id.button7)
        var button8 = findViewById<ImageView>(R.id.button8)
        var buttonreset = findViewById<Button>(R.id.button_Start)
        button0.setOnClickListener {
            if (board[0] != "")
            else if (chance == "X") {
                button0.setImageResource(R.drawable.x)
                board[0] = "X"
                chance = "O"
            } else {
                button0.setImageResource(R.drawable.o)
                board[0] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button1.setOnClickListener {
            if (board[1] != "")
            else if (chance == "X") {
                button1.setImageResource(R.drawable.x)
                board[1] = "X"
                chance = "O"
            } else {
                button1.setImageResource(R.drawable.o)
                board[1] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button2.setOnClickListener {
            if (board[2] != "")
            else if (chance == "X") {
                button2.setImageResource(R.drawable.x)
                board[2] = "X"
                chance = "O"
            } else {
                button2.setImageResource(R.drawable.o)
                board[2] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button3.setOnClickListener {
            if (board[3] != "")
            else if (chance == "X") {
                button3.setImageResource(R.drawable.x)
                board[3] = "X"
                chance = "O"
            } else {
                button3.setImageResource(R.drawable.o)
                board[3] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button4.setOnClickListener {
            if (board[4] != "")
            else if (chance == "X") {
                button4.setImageResource(R.drawable.x)
                board[4] = "X"
                chance = "O"
            } else {
                button4.setImageResource(R.drawable.o)
                board[4] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button5.setOnClickListener {
            if (board[5] != "")
            else if (chance == "X") {
                button5.setImageResource(R.drawable.x)
                board[5] = "X"
                chance = "O"
            } else {
                button5.setImageResource(R.drawable.o)
                board[5] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button6.setOnClickListener {
            if (board[6] != "")
            else if (chance == "X") {
                button6.setImageResource(R.drawable.x)
                board[6] = "X"
                chance = "O"
            } else {
                button6.setImageResource(R.drawable.o)
                board[6] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button7.setOnClickListener {
            if (board[7] != "")
            else if (chance == "X") {
                button7.setImageResource(R.drawable.x)
                board[7] = "X"
                chance = "O"
            } else {
                button7.setImageResource(R.drawable.o)
                board[7] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button8.setOnClickListener {
            if (board[8] != "")
            else if (chance == "X") {
                button8.setImageResource(R.drawable.x)
                board[8] = "X"
                chance = "O"
            } else {
                button8.setImageResource(R.drawable.o)
                board[8] = "O"
                chance = "X"
            }
            resultOut(board)
        }
        buttonreset.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }

    private fun resultOut(board: ArrayList<String>) {
        if (result(board, "X")) {
            startActivity(Intent(this@MainActivity, WonActivity::class.java).putExtra("player", "X"))
            finish()
        } else if (result(board, "O")) {
            startActivity(Intent(this@MainActivity, WonActivity::class.java).putExtra("player", "O"))
            finish()
        }
        if (isBoardFull(board)) {
            startActivity(Intent(this@MainActivity, WonActivity::class.java).putExtra("player", "Tie"))
            finish()
        }
    }

    private fun isBoardFull(board: ArrayList<String>): Boolean {
        for (i in board)
            if (i != "X" && i != "O") return false
        return true
    }

    private fun result(bd: ArrayList<String>, s: String): Boolean =
        if (bd[0] == s && bd[1] == s && bd[2] == s) true
        else if (bd[3] == s && bd[4] == s && bd[5] == s) true
        else if (bd[6] == s && bd[7] == s && bd[8] == s) true
        else if (bd[0] == s && bd[3] == s && bd[6] == s) true
        else if (bd[1] == s && bd[4] == s && bd[7] == s) true
        else if (bd[2] == s && bd[5] == s && bd[8] == s) true
        else if (bd[0] == s && bd[4] == s && bd[8] == s) true
        else bd[2] == s && bd[4] == s && bd[6] == s
}