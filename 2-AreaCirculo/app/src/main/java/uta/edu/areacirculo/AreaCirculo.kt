package uta.edu.areacirculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class AreaCirculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areacirculo)
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //
        val et_radio=findViewById<EditText>(R.id.txtRadio);
        val lbl_resultado=findViewById<TextView>(R.id.lblResultado)
        val btnResultado=findViewById<Button>(R.id.btnResultado);
        //
        val creador=findViewById<TextView>(R.id.lblAutor)
        //Metodo onclick
        btnResultado.setOnClickListener {
            //Inicio
            val radio=et_radio.text.toString().toDouble();
            val PI=3.1416;
            //Proceso
            val totalRadio= round(((PI*(radio*radio))*1000.0)/1000.0);
            //Salida
            lbl_resultado.setText("El radio es >> "+totalRadio)
            //autor
            creador.setText("©Diego Abril - 2022");


        }

    }
    //FIN
}