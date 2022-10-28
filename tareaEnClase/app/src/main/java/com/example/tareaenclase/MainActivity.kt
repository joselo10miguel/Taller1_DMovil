package com.example.tareaenclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Clacular edad
        edad()
        // Tbla de multiplicar de forma ascendente y descendente
        tablaMultiplicar()
         // Listado de estudiantes
        listado()
        // Propiedades del vehiculo
        propiedades()
        // Claculo del iba del 12 %
        iva()
        // Cedula
        cedula()
    }

    fun edad(){
     val edad = 18
     val edad2 = 3

     if(edad<18){
         println("Usted es menor de edad")
    }else{
        println("Usted es mayo de edad")
    }
}
    fun tablaMultiplicar(){
        val n = 3

        println("    Tabla de Multiplicar en forma Ascendentede " + n)
        for ( i in 1..10) {
            val resultado = String.format("%s%s%s%s%s",n,"*",i,"= ", n*i)
            println(resultado)
        }
        println("   Tabla de Multiplicar en forma Descendentede " + n)
        for ( i in 10 downTo  1) {
            val resultado2 = String.format("%s%s%s%s%s",n,"*",i," = ", n*i)
            println(resultado2)
        }

    }


    fun listado(){
        println("__________________ LISTADO ___________________")
        val listas = listOf<String>("Andrés Jimenez","Carlos Castillo","Carlos Tandazo",
            "Isaias Silva", "Jhoselin Guachizaca")

        val ordenar = listas.sorted()
        println("Listado de Estudiantes")
        for (listas in ordenar){
            println(listas)
        }
        val grupos = mutableMapOf("Andrés Jimenez" to "P1","Carlos Castillo" to "P1",
            "Carlos Tandazo" to "P1", "Isaias Silva" to "P2", "Jhoselin Guachizaca" to "P2")

        val ordenGrupo = grupos.toSortedMap()
        println("Listado de Estudiantes por Proyectos")
        for (i in ordenGrupo ){
            println("${i.key} - ${i.value}")
        }
    }

    fun propiedades(){
        println("--------------------- PROPIEDADES -------------------------------------------- ")
        val carro =Carro(arrayOf(Carro.combustibles.Gasolina),marca = "Toyota",tipo="Familiar",
            capacidad="5 personas")
        carro.vehiculo()
        println(carro.marca)
        println(carro.tipo)
        println(carro.capacidad)
    }

    fun iva(){
        println("_________________ IVA 12 %________________________")
        var num = 100
        var total = (num + (num*0.12))
        println("Total " + num)
        println("Total  + 12 % de Iva: "+ total)
    }
     fun cedula(){
        println("---------------------- CEDULA --------------------- ")
        val cedula = arrayListOf<Int>(1,1,5,0,2,0,3,1,1,3)
        var total =0
        var contador=0
        val numeroFinal = cedula.last()
        for(x in cedula.indices){
            contador=cedula[x]
            if(x%2==0){
                contador=(cedula[x]*2)
                if (contador>9){
                    contador = contador-9
                }
                total = total+contador
            }else{
                total = total+contador
            }
        }
        total = total - numeroFinal
        val primerNumero = total.toString().substring(0,1)
        val decena = (primerNumero.toInt()+1)*10
        if (decena-total==numeroFinal||decena-total==10){
            println("La cedula : $cedula  si es valida.")
        }else{
            println("La cedula :  $cedula no es valida.")
        }
    }
}