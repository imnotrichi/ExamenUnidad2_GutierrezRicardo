package mx.edu.itson.examenunidad2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Productos : AppCompatActivity() {
    var productos:ArrayList<Producto> = ArrayList<Producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var opcionMenu:String? = intent.getStringExtra("opcionMenu")
        var tvTitulo:TextView = findViewById(R.id.tvTitulo)

        agregarProductos(tvTitulo, opcionMenu)

        var lvProductos:ListView = findViewById(R.id.lvProductos)

        var adaptador:AdaptadorProductos = AdaptadorProductos(this, productos)
        lvProductos.adapter = adaptador
    }

    fun agregarProductos(tvTitulo:TextView, opcionMenu:String?) {
        when(opcionMenu) {
            "Detalles" -> {
                tvTitulo.setText("Detalles")
                productos.add(Producto(R.drawable.cumplebotanas, "Botanas", 280.0))
                productos.add(Producto(R.drawable.cumplecheve, "Cheve", 320.0))
                productos.add(Producto(R.drawable.cumpleescolar, "Escolar", 330.0))
                productos.add(Producto(R.drawable.cumplepaletas, "Paletas", 190.0))
                productos.add(Producto(R.drawable.cumplesnack, "Snack", 150.0))
                productos.add(Producto(R.drawable.cumplevinos, "Vinos", 370.0))
            }

            "Globos" -> {
                tvTitulo.setText("Globos")
                productos.add(Producto(R.drawable.globoamor, "Amor", 240.0))
                productos.add(Producto(R.drawable.globocumple, "Cumpleaños", 820.0))
                productos.add(Producto(R.drawable.globofestejo, "Festejo", 260.0))
                productos.add(Producto(R.drawable.globonum, "Numero", 760.0))
                productos.add(Producto(R.drawable.globoregalo, "Regalo", 450.0))
                productos.add(Producto(R.drawable.globos, "Globos", 240.0))
            }

            "Peluches" -> {
                tvTitulo.setText("Peluches")
                productos.add(Producto(R.drawable.peluchemario, "Mario", 320.0))
                productos.add(Producto(R.drawable.pelucheminecraft, "Minecraft", 320.0))
                productos.add(Producto(R.drawable.peluchepeppa, "Peppa Pig", 290.0))
                productos.add(Producto(R.drawable.peluches, "Peluches", 200.0))
                productos.add(Producto(R.drawable.peluchesony, "Sonic", 330.0))
                productos.add(Producto(R.drawable.peluchestich, "Stitch", 280.0))
                productos.add(Producto(R.drawable.peluchevarios, "Varios", 195.0))
            }

            "Regalos" -> {
                tvTitulo.setText("Regalos")
                productos.add(Producto(R.drawable.regaloazul, "Azul", 80.0))
                productos.add(Producto(R.drawable.regalobebe, "Bebé", 290.0))
                productos.add(Producto(R.drawable.regalocajas, "Cajas", 140.0))
                productos.add(Producto(R.drawable.regalocolores, "Colores", 85.0))
                productos.add(Producto(R.drawable.regalos, "Regalos", 100.0))
                productos.add(Producto(R.drawable.regalovarios, "Varios", 75.0))
            }

            "Tazas" ->  {
                tvTitulo.setText("Tazas")
                productos.add(Producto(R.drawable.tazaabuela, "Abuela", 120.0))
                productos.add(Producto(R.drawable.tazalove, "Amor", 120.0))
                productos.add(Producto(R.drawable.tazaquiero, "Te Quiero", 260.0))
                productos.add(Producto(R.drawable.tazas, "Tazas", 280.0))
            }

        }
    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Producto>()
        var contexto: Context?= null

        constructor(contexto: Context, productos:ArrayList<Producto>) {
            this.productos = productos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = productos[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.imagen)
            nombre.setText(prod.nombre)
            precio.setText("${prod.precio}")
            return vista
        }
    }
}

