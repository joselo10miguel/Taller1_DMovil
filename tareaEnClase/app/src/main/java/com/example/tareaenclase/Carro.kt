package com.example.tareaenclase

class Carro (val combustible: Array<combustibles>,val marca: String, val tipo: String, val capacidad:String) {
    enum class combustibles{
        Diesel,Gasolina
    }
    fun vehiculo(){
        for(combustibles in combustible){
            println("El vehiculo es de : "+combustibles)
        }
    }

}