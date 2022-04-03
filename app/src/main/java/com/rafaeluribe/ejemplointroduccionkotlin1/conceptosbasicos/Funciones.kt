package com.rafaeluribe.ejemplointroduccionkotlin1.conceptosbasicos

fun main(){
    mostrarNombreCompleto("Juan", "Perez")

    imprimirFrutas("Cereza", "Manzana")
    imprimirFrutas("Uva", "Manzana","Frutilla", "Platano", "Melon", "Piña")

    var x = 3

    when(x){
        1-> println("Feliz Lunes")
        2-> println("Feliz martes")
        3-> println("Feliz miércoles")
        else ->{
            println("Día inválido!...")
        }
    }

    var op = "+"
    val res = when(op) {
        "+" -> 3+2
        "-" -> 3-2
        "*" -> 3*2
        "/" -> 3/2
        else ->{
            -9999
        }

    }
    println(res)
}

fun imprimirFrutas(vararg x:String){

    for(i in 0..x.size-1){
        println(x[i])
    }

    for(item in x){
        println(item)
    }
}

fun mostrarNombreCompleto( nombre:String,  apellido:String){
    println("Hola $nombre $apellido ¿Como estás?")
}