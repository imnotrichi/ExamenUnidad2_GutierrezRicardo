package mx.edu.itson.examenunidad2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuOpciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_opciones)

        val btnDetalles:Button = findViewById(R.id.btnDetalles)
        val btnGlobos:Button = findViewById(R.id.btnGlobos)
        val btnPeluches:Button = findViewById(R.id.btnPeluches)
        val btnRegalos:Button = findViewById(R.id.btnRegalos)
        val btnTazas:Button = findViewById(R.id.btnTazas)

        btnDetalles.setOnClickListener {
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("opcionMenu", "Detalles")
            startActivity(intent)
        }

        btnGlobos.setOnClickListener {
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("opcionMenu", "Globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener {
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("opcionMenu", "Peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener {
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("opcionMenu", "Regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
            var intent: Intent = Intent(this, Productos::class.java)
            intent.putExtra("opcionMenu", "Tazas")
            startActivity(intent)
        }
    }
}