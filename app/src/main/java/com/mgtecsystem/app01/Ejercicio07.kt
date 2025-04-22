package com.mgtecsystem.app01

fun main(){
    //suma() no retorna valor
    suma()
    //suma2() si retorna valor
    var respuesta = suma2()
    println("El valor obtenido de la función suma2 es: $respuesta")

    println("La resta es: ${resta(10,6)}")
    var resta: Int = resta(10,6)

    //Multiplicar el resultado de suma2 * resta
    var restulado_multi = multi(respuesta, resta)
    println("El resultado es: $restulado_multi")
}

//Función que no retorna valor
fun suma(){
    var resp = 5 + 9
    println("La suma es: $resp")
}

fun suma2(): Int{
    var resp = 5 + 9
    println("La suma es: $resp")
    return resp
}

fun resta(n1: Int, n2: Int): Int{
    return n1 - n2
}

fun multi(num1: Int, num2: Int): Int{
    return num1 * num2
}


