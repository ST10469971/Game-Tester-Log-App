package vcmsa.ci.gametesterlogapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val app_name = findViewById<TextView>(R.id.app_name)
        val student_info = findViewById<TextView>(R.id.student_info)
        val startButton = findViewById<Button>(R.id.start_btn)
        val ExitButton = findViewById<Button>(R.id.exit_btn)

        app_name.text = "Welcome to the True/False Quiz!"
        student_info.text = "Test your knowledge with these fun flashcards"

        //Set the setOnClickListener for the Start Button
        startButton.setOnClickListener {
            //Start the input screen activity
            val intent = Intent(this, InputScreen::class.java)
            startActivity(intent)
        }
         //Set the setOnClickListener for the Exit Button
        ExitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)

        }
    }
}