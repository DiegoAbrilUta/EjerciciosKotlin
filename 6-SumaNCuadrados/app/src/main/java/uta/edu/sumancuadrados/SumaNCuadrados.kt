package uta.edu.sumancuadrados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SumaNCuadrados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumancuadrados)
        //Variables
        val inicio=findViewById<EditText>(R.id.txtRangoInicial);
        val final=findViewById<EditText>(R.id.txtRangoFinal);
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //
        val btn_calcular=findViewById<Button>(R.id.btnResultado);
        //
        val lbl_resultado=findViewById<TextView>(R.id.lblResultado);
        //
        val creador=findViewById<TextView>(R.id.lblAutor);
        //Metodo onClick
        btn_calcular.setOnClickListener {
            //INicio
            val rangoInicial=inicio.text.toString().toInt();
            val rangoFinal=final.text.toString().toInt();
            var suma=0;
            //Proceso
            for(x in rangoInicial until rangoFinal+1){
                 suma+=(x*x);
                lbl_resultado.text="$suma";
            }
            //Salida
            //lbl_resultado.text="$s";
            //autor
            creador.setText("©Diego Abril - 2022");

        }
    }
//FIN
}