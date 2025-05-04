package com.mgtecsystem.app01

import com.mgtecsystem.app01.model.Persona

fun main(){

    //Capturamos los 3 datos
    println("Trabajando con clases")
    print("Ingresa DNI: ")
    var dni: String = readLine()!!.toString()
    print("Ingrese Nombre: ")
    var nombre: String = readLine()!!.toString()
    print("Ingrese Apellidos: ")
    var apellidos: String = readLine()!!.toString()

    //Creamos el objeto
    var persona01: Persona = Persona(dni,nombre,apellidos)

    do {
        //Opción de actualización
        println("Opciones de actualización: ")
        println(
            "1 = DNI \n" +
            "2 = Nombres \n" +
            "3 = Apellidos \n" +
            "4 = Finalizar la aplicación"
        )
        var opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Actualizar el DNI: ")
                var nuevoDNI: String = readLine()!!.toString()
                persona01.setDNI(nuevoDNI)
                persona01.getDatos()
            }

            2 -> {
                print("Actualiza el Nombre: ")
                var nuevoNombre: String = readLine()!!.toString()
                persona01.setNombre(nuevoNombre)
                persona01.getDatos()
            }

            3 -> {
                print("Actualiza los apellidos: ")
                var nuevoApellidos: String = readLine()!!.toString()
                persona01.setApellidos(nuevoApellidos)
                persona01.getDatos()
            }

            4 -> {
                println("La aplicación finalizó, gracias por crear el objeto.")
            }

            else -> {
                println("El dato ingresado no es válido.")
            }
        }
        //Fin opciones de actualización
    }while(opcion != 4)


}