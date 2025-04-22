package com.mgtecsystem.app01

//Trabajando con funciones
//Con operaciones básicas

fun main(){

    println("Realizar operaciones básicas ")
    println("Ingresar un numero para cada opción: ")
    print("(1 suma | 2 resta | 3 multiplcación | 4 División):")
    var opcion: Int = readLine()!!.toInt()

    if(opcion != null && opcion in 1..4){
        print("Ingresar el primer valor: ")
        var num1: Int = readLine()!!.toInt()
        print("Ingresar el segundo valor: ")
        var num2: Int = readLine()!!.toInt()

        when(opcion){
            1 -> println("La suma es: ${sum(num1, num2)}")
            2 -> println("La resta es: ${rest(num1, num2)}")
            3 -> println("La multiplicación es: ${multi(num1, num2)}")
            4 -> println("La división es: ${divi(num1, num2)}")
        }

    }else{
        println("Opción inválida")
    }
}

fun sum(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun rest(n1: Int, n2: Int): Int{
    return n1 - n2
}

fun mult(n1: Int,n2: Int): Int{
    return n1 * n2
}

fun divi(n1: Int,n2: Int): Int{
    return n1 / n2
}