package pe.edu.idat.ec1_choquegomez

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.edu.idat.ec1_choquegomez.databinding.ActivityEjercicio1Binding
import pe.edu.idat.ec1_choquegomez.databinding.ActivityMainBinding

class Ejercicio1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityEjercicio1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncal.setOnClickListener(this)
        binding.btnsiguienteex.setOnClickListener(this)
    }

    private fun convertirARomano(numero: Int): String {
        return when (numero) {
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            10 -> "X"
            else -> ""
        }
    }

    private fun numeroD() {
        val num = binding.num1.text.toString().toIntOrNull() // Cambia a toIntOrNull() para evitar excepciones

        if (num != null && num in 1..10) {
            val numeroRomano = when (num) {
                1 -> "I"
                2 -> "II"
                3 -> "III"
                4 -> "IV"
                5 -> "V"
                6 -> "VI"
                7 -> "VII"
                8 -> "VIII"
                9 -> "IX"
                10 -> "X"
                else -> ""
            }
            binding.resultaddo.text = "El número en romano es: $numeroRomano" // Muestra el número romano
        } else {
            binding.resultaddo.text = "Por favor, ingresa un número entre 1 y 10." // Mensaje en caso de error
        }
    }

    private fun irEjercicio2() {
        val intentEjercicio2 = Intent(
            this, Ejercicio2::class.java)
        startActivity(intentEjercicio2)
    }



    override fun onClick(p0: View?) {
        p0?.let { view ->
            when (view.id) {
                R.id.btncal -> numeroD()
                R.id.btnsiguienteex -> irEjercicio2()
            }
        }
    }

}