package mx.edu.itson.examenunidad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVisitar:Button = findViewById(R.id.btnVisitar)

        btnVisitar.setOnClickListener {
            var intent: Intent = Intent(this, MenuOpciones::class.java)
            startActivity(intent)
        }
    }
}