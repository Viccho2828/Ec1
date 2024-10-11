package pe.edu.idat.ec1_choquegomez

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.edu.idat.ec1_choquegomez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncalcular.setOnClickListener(this)
    }



    override fun onClick(p0: View?) {
        val horas = binding.etnumero1.text.toString().toInt()

        val sal: Int

        if (horas <= 40) {
            sal = horas * 16
        } else {
            val horasExtras = horas - 40
            sal = (40 * 16) + (horasExtras * 20)
        }
        binding.result.text = "El salario semanal es: S/. $sal"
        }
    }