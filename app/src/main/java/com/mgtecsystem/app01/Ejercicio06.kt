package com.mgtecsystem.app01

fun main(){
    //Ejercicios 02 estructuras repetitivas

    //Tabla de multiplicar
    var num: Int = 10
    var resp: Int = 0

    //for
    println("Tabla de multiplicar de $num del 1 al 12 (con FOR)")
    for(i in 1..12){
        resp = num * i
        println("$num * $i = $resp")
    }


    //While
    println("Tabla de multiplicar de $num del 1 al 12 (con WHILE)")
    var j:Int = 1

    while (j <= 12){
        resp = num * j
        println("$num * $j = $resp")
        j++
    }

    //DO WHILE
    println("Tabla de multiplicar de $num del 1 al 12 (con DO WHILE)")
    var k: Int = 1
    do {
        resp = num * k
        println("$num * $k = $resp")
        k++
    }while(k<=12)
}