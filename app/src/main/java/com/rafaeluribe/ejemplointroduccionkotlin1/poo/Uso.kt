package com.rafaeluribe.ejemplointroduccionkotlin1.poo

fun main(){

    var p1 = Persona("1111-1", "Juan Perez", 30)

    println("Estos son los datos: rut: ${p1.rut} " +
            "nombre: ${p1.nombre} edad: ${p1.edad}")

    var p2 = Persona()
    var p3 = Persona("333-3")
}