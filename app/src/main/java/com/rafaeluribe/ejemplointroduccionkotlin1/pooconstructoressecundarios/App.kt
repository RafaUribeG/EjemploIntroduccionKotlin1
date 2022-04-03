package com.rafaeluribe.ejemplointroduccionkotlin1.pooconstructoressecundarios

fun main(){

    var a1 = Alumno("Mate", "111-1")
    a1.actuar()

    var textoMensaje = mensaje.ERRO1.m
    println(textoMensaje)

    var x = ""
    x.saludo()
}

fun String.saludo(){
    print("Hola")
}

enum class mensaje(val m:String){
    MENSAJE("ESTE ES UN MENSAJE SIMPLE"),
    TOAST("ESTE ES UN TOAST"),
    DIALOGO("ESTE ES UN DIALOGO"),
    ERRO1("ERROR DE BD"),
    ERRO2("ERROR DE SERVIDOR WEB"),
    ERRO3("ERROR DE RED")
}
