package uta.edu.horaaminutossegundos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HoraMinutosSegundos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horaminutossegundos)
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //
        val et_hora=findViewById<EditText>(R.id.txtHora);
        val btn_conversion=findViewById<Button>(R.id.btnConversionHMS);
        val lbl_minutos=findViewById<TextView>(R.id.lblMinutos);
        val lbl_segundos=findViewById<TextView>(R.id.lblSegundos);
        //
        val creador=findViewById<TextView>(R.id.lblAutor)
        //
        btn_conversion.setOnClickListener {
            //Inicio
            val hora=et_hora.text.toString().toInt();
            //Proceso
            val h=60;
            val min=60;
            val minutos=hora*h;
            val segundos=minutos*60;
            //Salida
            //lbl_minutos.setText(""+minutos)
            lbl_minutos.text="$minutos";
            //lbl_segundos.setText(""+segundos)
            lbl_segundos.text="$segundos";
            //Autor
            creador.setText("©Diego Abril - 2022");


        }
    }
}