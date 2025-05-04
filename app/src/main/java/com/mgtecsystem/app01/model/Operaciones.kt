package com.mgtecsystem.app01.model

class Operaciones(private var num1: Double=0.0, private var num2: Double= 0.0) {

    fun suma(): Double{
        return num1 + num2
    }

    fun resta(): Double{
        return num1 - num2
    }

    fun multi(): Double{
        return num1 * num2
    }

    fun divi(): Double{
        return num1 / num2
    }

    fun capturaDatos(){
        println("Realizando operaciones calculo básico")
        print("Ingresar primer número: ")
        num1 = readLine()!!.toDouble()
        print("Ingresar segundo número: ")
        num2 = readLine()!!.toDouble()
    }

    fun resultados(){
        println("La suma es: ${suma()}")
        println("La resta es: ${resta()}")
        println("La multiplicación es: ${multi()}")
        println("La división es: ${divi()}")
    }
}