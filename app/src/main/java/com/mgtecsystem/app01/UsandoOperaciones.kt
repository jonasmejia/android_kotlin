package com.mgtecsystem.app01

import com.mgtecsystem.app01.model.Operaciones

fun main(){
    //Creando el objeto operaciones
    //var op: Operaciones = Operaciones(num1, num2)
    var op: Operaciones = Operaciones()
    op.capturaDatos()

    //El calculo o proceso
    op.resultados()

}