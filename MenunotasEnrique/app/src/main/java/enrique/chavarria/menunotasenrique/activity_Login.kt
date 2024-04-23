package enrique.chavarria.menunotasenrique

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1. Mandar a llamar todos los elementos
        val btnRegistrarse  = findViewById<Button>(R.id.btnRegistrarse)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener {
            val pantallaHome = Intent(this, MainActivity::class.java)
            startActivity(pantallaHome)
        }

        //2. Programo el boton
        btnRegistrarse.setOnClickListener {
            //Navegar entre pantallas
            //Voy a ir a la pantalla de Registro
            val pantallaRegistrarse = Intent(this, Activity_Registrarse::class.java)
            startActivity(pantallaRegistrarse)



        }
    }
}