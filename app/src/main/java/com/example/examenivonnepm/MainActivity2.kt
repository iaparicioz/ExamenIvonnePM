package com.example.examenivonnepm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val lista: List<String> = listOf("Lunes", "Martes", "Miércoles")
        boton1

        boton1.setOnClickListener {
            textView.text = lista[0] + lista[0].length
            textView.append(lista[1] + lista[1].length + "\n")
            textView.append(lista[2] + lista[2].length + "\n")

        }
        boton2
        boton2.setOnClickListener {
            var maxLength=0
             // textView.text = lista.sorted().toString() + "\n"
           /* for (i in lista) {
                if ()
            }*/
            textView.text = lista.sorted().toString() + "\n"

            //lo que quiero es ordenar la lista para que el elemento con la
            //longuitd mas larga
        }

        boton3
        //queria realizar y convertir el el edit text introducido a un integer 
         var a = Integer.valueOf(editText2.text)
        boton3.setOnClickListener{
            for(elemento in lista) {
                if (elemento.length>3){
                    textView.text=lista[]

                }
            }

        }



    }
}





