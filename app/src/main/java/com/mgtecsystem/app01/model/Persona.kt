package com.mgtecsystem.app01.model

class Persona(
    private var dni: String ="", private var nombre: String ="", private var apellidos: String =""
){

    //Funciones para obtener los datos del objeto que crearemos
    fun getDNI(): String{
        return dni
    }

    fun getNombre(): String{
        return nombre
    }

    //Funciones para poder actualizar los datos de el objeto creado
    fun setDNI(nuevoDni: String){
        dni = nuevoDni
        println("DNI Actualizado correctamente")
    }

    fun setNombre(nuevoNombre: String){
        nombre = nuevoNombre
        println("Nombre actualizado correctamente")
    }

    fun setApellidos(nuevoApellidos: String){
        apellidos = nuevoApellidos
        println("Apellidos actualizados correctamente")
    }

    fun getDatos(){
        println("*******************************")
        println("Reporte de datos del Objeto")
        println("DNI: ${dni}")
        println("Nombres y apellidos: ${nombre} ${apellidos}")

    }
}