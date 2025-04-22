package com.mgtecsystem.app01

fun main() {

    //Estructura condicional de seleccion multiple
    //Nombre del dia de la semana
    //lunes = 1, martes = 2, ..., domingo = 7, 878 =  el número de dia es incorrecto

    var numDia: Int = 8
    var nomDia: String = ""

    //Procesando datos
    when(numDia){
        1 -> nomDia = "Lunes"
        2 -> nomDia = "Martes"
        3 -> nomDia = "Miércoles"
        4 -> nomDia = "Jueves"
        5 -> nomDia = "Viernes"
        6 -> nomDia = "Sábado"
        7 -> nomDia = "Domingo"
        else -> nomDia = "El número ingresado es incorrecto"
    }

    //Mostrar resultados
    println(nomDia)


}