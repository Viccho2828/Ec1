package pe.edu.idat.ec1_choquegomez

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.edu.idat.ec1_choquegomez.databinding.ActivityEjercicio1Binding
import pe.edu.idat.ec1_choquegomez.databinding.ActivityMainBinding

class Ejercicio1 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncal.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val num = binding.num1.text.toString().toInt()

        if (num != null && num in 1..10) {
            val romano = convertirARomano(num)
            binding.resultaddo.text = "El numero en romano es: $romano"
        }
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
}