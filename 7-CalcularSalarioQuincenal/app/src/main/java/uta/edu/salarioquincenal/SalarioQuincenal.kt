package uta.edu.salarioquincenal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class SalarioQuincenal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salarioquincenal)
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //Variables
        val et_horas=findViewById<EditText>(R.id.txtHoras);
        val et_salario=findViewById<EditText>(R.id.txtSalarioxHora);
        //
        val btn_quincena=findViewById<Button>(R.id.btnCalcularQuincena);
        //
        val lbl_resltado=findViewById<TextView>(R.id.lblTotalSalario);
        //
        val creador=findViewById<TextView>(R.id.lblAutor);
        //Metdo onClick
        btn_quincena.setOnClickListener {
            //Inicio
            val horasTranajadas=et_horas.text.toString().toInt();
            val salarioXHora=et_salario.text.toString().toDouble();
            //Proceso
            val totalQuincena=(round((horasTranajadas*salarioXHora)*1000.0)/1000.0);
            //Salida
            lbl_resltado.text="$totalQuincena"
            //autor
            creador.setText("©Diego Abril - 2022");
        }
    }
//FIN
}