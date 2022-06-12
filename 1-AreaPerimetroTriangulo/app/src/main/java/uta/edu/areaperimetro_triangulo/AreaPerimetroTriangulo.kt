package uta.edu.areaperimetro_triangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt
//
import kotlin.math.round

class AreaPerimetroTriangulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areaperimetrotriangulo)
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //Variables
        //Inicio1
        val lado=findViewById<EditText>(R.id.txtLado);
        val base=findViewById<EditText>(R.id.txtBase);
        val altura=findViewById<EditText>(R.id.txtAltura);
        val btnResultado=findViewById<Button>(R.id.bnResultado);
        val totalPerimetro=findViewById<TextView>(R.id.lblPerimetroTriangulo);
        val totalArea=findViewById<TextView>(R.id.lblAreaTriangulo);
        //Autor
        val creador=findViewById<TextView>(R.id.lblAutor);
        //Proceso
        btnResultado.setOnClickListener {
            //
            val nLadosTrianfulo=3;
            val lado=lado.text.toString().toDouble();
            val b=base.text.toString().toDouble();
            val h=altura.text.toString().toDouble();
            //
            val perimetro= (round((lado*nLadosTrianfulo)*1000.0)/1000.0);
            val area=(round(((b*h)/2)*1000.0)/1000.0)
           // val hecho=

            //Salida
            totalPerimetro.setText("El perímetro es >> "+perimetro);
            totalArea.setText("El Área es >> "+ area);
            //autor
            creador.setText("©Diego Abril - 2022");
        }
        //FIN
    }
}