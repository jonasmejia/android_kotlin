package com.mgtecsystem.app01

fun main(){

    //Estructura repetitiva for, while, do while
    //Mostrar los números del 1 al 10

    println("Con for")
    for(i in 1..10){
        println(i)
    }

    println("Con while")
    var i: Int = 1
    while(i <=10){
        println(i)
        i++
    }

    println("Con Do while")
    var j: Int = 1
    do {
        println(j)
        j++
    }while(j<=10)
}