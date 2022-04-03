package com.rafaeluribe.ejemplointroduccionkotlin1.conceptosbasicos

fun main(){
    var num1:Int
    var num2:Int

    //println("Ingrese primer numero")
    //num1 = readLine()!!.toInt()

    //println("Ingrese segundo numero")
    //num2 = readLine()!!.toInt()

    //var res = num1+num2

    //println("Las suma de $num1 + $num2 es = $res ")

    val byteMinimo = Byte.MIN_VALUE
    val byteMaximo = Byte.MAX_VALUE
    val intMinimo = Int.MIN_VALUE
    val intMaximo = Int.MAX_VALUE
    val shortMinimo = Short.MIN_VALUE
    val shortMaximo = Short.MAX_VALUE
    val longMinimo = Long.MIN_VALUE
    val longMaximo = Long.MAX_VALUE

    println(byteMinimo)
    println(byteMaximo)
    println(intMinimo)
    println(intMaximo)
    println(shortMinimo)
    println(shortMaximo)
    println(longMinimo)
    println(longMaximo)

    var vf:Float = 3.2f

    var xxx:Boolean = true
    var yyy = false

    var letra:Char = 'a'
    var palabra = "esto es una frase"

    println(mostrarNombre())

    mostrarNombre2()

}


fun mostrarNombre(): String{
    return "Juanito Perez"
}

fun mostrarNombre2():Unit{
    println("Hola sin retorno")
}