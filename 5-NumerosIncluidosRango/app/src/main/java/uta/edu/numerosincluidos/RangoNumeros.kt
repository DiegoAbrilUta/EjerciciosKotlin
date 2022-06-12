package uta.edu.numerosincluidos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RangoNumeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rangonumeros)
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //
        val et_inicio=findViewById<EditText>(R.id.txtRangoInicial);
        val et_fin=findViewById<EditText>(R.id.txtRangoFinal);
        val btn_rangoN=findViewById<Button>(R.id.btnRangoDeNumeros);
        val lbl_rangoN=findViewById<TextView>(R.id.lblValores);
        val lbl_contador=findViewById<TextView>(R.id.lblContador);
        val creador=findViewById<TextView>(R.id.lblAutor);
        //
        btn_rangoN.setOnClickListener {
            //Inicio
            val rangoInicial=et_inicio.text.toString().toInt();
            val rangoFinal=et_fin.text.toString().toInt();
            var numero=0;
            var texto="";
            //Proceso
           for (x in rangoInicial until rangoFinal-1 step 1){
               texto=texto+(x+1)+" ";
               numero+=1;
            }
            //Salida
            lbl_rangoN.text="$texto";
            lbl_contador.text="Cantidad números >> "+"$numero";
            //autor
            creador.setText("©Diego Abril - 2022");
        }
    }
    //FIN
}