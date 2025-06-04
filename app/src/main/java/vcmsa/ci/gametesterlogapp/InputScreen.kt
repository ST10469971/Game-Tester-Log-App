package vcmsa.ci.gametesterlogapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class InputScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input_screen)

        val Date = findViewById<TextView>(R.id.date_editText)
        val MinutesPlayed = findViewById<TextView>(R.id.minutes_played)
        val addButton = findViewById<Button>(R.id.add_entry)
        val ResetButton = findViewById<Button>(R.id.reset_btn)
        val ExitButton = findViewById<Button>(R.id.go_to_details)



        addButton.setOnClickListener {

            val intent = Intent(this, InputScreen::class.java)
            startActivity(intent)
        }
        ResetButton.setOnClickListener {

            val intent = Intent(this, InputScreen::class.java)
            startActivity(intent)
        }
        ExitButton.setOnClickListener {

            val intent = Intent(this, InputScreen::class.java)
            startActivity(intent)
        }
        ExitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)


        }
    }
}
