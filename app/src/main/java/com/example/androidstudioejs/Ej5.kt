package com.example.androidstudioejs

import kotlin.math.pow

import kotlin.math.sqrt

fun powers(list: List<Double>, power: Int): List<Double>{
    return list.map { it.pow(power) }
}

fun productOfPairs(list: List<Int>): Double {
    val nombresParells = list.filter {
        it % 2 == 0
    }

    return nombresParells.reduce{ accumulator, elem ->
        accumulator * elem
    }.toDouble()


}

fun powersOf2(limit: Double): List<Double>{
    val intPart = Math.sqrt(limit).toInt()

    val list = 1..intPart-1

    return list.mapIndexed { i, it ->
        2.0.pow(i.toDouble())
    }

}

fun equals(l1: List<Int>, l2: List<Int>): Boolean{
    l1.forEach({ it ->
        l2.forEach({ it2 ->
            if(it != it2) return false
        })
    })
    return true
}

fun sumLists(l1: List<Int>, l2: List<Int>): List<Int>{
    val d = l1.zip(l2) { e1, e2 ->
        e1 + e2
    }

    return d
}

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta

    /**Ej1**/
    val l = powers(listOf(1.0,2.0,3.0,4.0), 3)
    for(i in 0 until l.size){
        print("${l[i]}, ")
    }
    println()
    println()
    /*****/

    /**Ej2**/
    println(productOfPairs(listOf(1,2,3,4)))
    println()
    /*****/

    /**Ej3**/
    val l2 = powersOf2(65.0)
    for(i in 0 until l2.size){
        print("${l2[i]}, ")
    }
    println()
    println()
    /*****/

    /**Ej4**/

    println()
    /*****/

    /**Ej5**/
    println(equals(listOf(1, 2, 3), listOf(1, 2, 3)))
    println()
    /*****/

    /**Ej6**/
    //println(equals(listOf(1, 2, 3), listOf(1, 2, 3)))
    println()
    /*****/

    /**Ej7**/
    val l3 = sumLists(listOf(1,1,2,2), listOf(10,11,12,13))
    for(i in 0 until l3.size){
        print("${l3[i]}, ")
    }
    println()
    println()
    /*****/

}