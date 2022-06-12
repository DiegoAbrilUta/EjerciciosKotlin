package uta.edu.calculoiva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.round

class CalcularImpuesto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcularimpuesto)
        //Icono
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setIcon(R.mipmap.ic_launcher_round);
        //
        //Variables
        val et_nombreProducto=findViewById<EditText>(R.id.txtNombreProducto);
        val et_cantidad=findViewById<EditText>(R.id.txtCantidad);
        val et_precio=findViewById<EditText>(R.id.txtPrecio);
        val btn_resultado=findViewById<Button>(R.id.btnResultado);
        val lbl_resultado=findViewById<TextView>(R.id.lblResultado);
        val lbl_listaTitulos=findViewById<TextView>(R.id.lblListaHorizontal);
        val creador=findViewById<TextView>(R.id.lblAutor);
        //
        btn_resultado.setOnClickListener {
            //Inicio
            val nombreProducto=et_nombreProducto.text.toString();
            val cantidadProducto=et_cantidad.text.toString().toInt();
            val precioProducto=et_precio.text.toString().toDouble();
            //Proceso
            lbl_listaTitulos.setText("Nombre || SubTotal || IVA || TOTAL")
            val IVA=14
            val subTotal=cantidadProducto*precioProducto;
            val subTotalProducto= round((subTotal*1000.0)/1000.0)
            val impuesto=(subTotalProducto*IVA)/100;
            val total=subTotal-impuesto;
            val totalProducto= round((total*1000.0)/1000.0)
            val totalImpuestoProducto=nombreProducto+"             "+
                                      subTotalProducto+"         "+
                                      IVA+"%"+"           "+
                                      totalProducto;
            //Salida

            lbl_resultado.setText(totalImpuestoProducto);
            //Autor
            creador.setText("©Diego Abril - 2022");


        }


    }
}