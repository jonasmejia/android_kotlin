package com.mgtecsystem.app01

fun main() {

    //Trabajar con estructuras condicionales

    //Mostrar si una persona es mayor o menor de edad
    val nombre: String = "Jonathan"
    val edad: Int = 17
    var mensaje: String = ""

    //PRocesar los datos
    //Estructura condicional doble
    if (edad >= 18) {
        mensaje = "$nombre, Eres mayor de edad, tienes $edad, años"
    } else {
        mensaje = "$nombre, Eres menor de edad, tienes $edad, años"
    }

    //Mostramos los resultados
    println(mensaje)

}