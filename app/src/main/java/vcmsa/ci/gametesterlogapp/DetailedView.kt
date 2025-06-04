package vcmsa.ci.gametesterlogapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        val recorded_entries = findViewById<TextView>(R.id.recorded_entries)
        val calccalculated_values = findViewById<TextView>(R.id.calculated_values)
        val MainscreenButton = findViewById<Button>(R.id.back_to_main_screen)
        val ExitButton = findViewById<Button>(R.id.exit_btn)








        }
    }

