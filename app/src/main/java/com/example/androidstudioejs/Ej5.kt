package com.example.androidstudioejs

import kotlin.math.log2
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
    val intPart = log2(limit).toInt()

    val list = 0..intPart

    return list.mapIndexed { i, it ->
        2.0.pow(i.toDouble())
    }

}

fun findInsert(orderedList: List<Int>, newNumber: Int): Int{
    var aux: Int = -1

    orderedList.forEachIndexed{ i, elem ->
        if(newNumber <= elem && aux == -1) aux=i
    }

    if(aux == -1) aux = orderedList.size

    return aux

}

fun <E> equals(l1: List<E>, l2: List<E>): Boolean{
    if(l1.size != l2.size) return false

    l1.forEachIndexed({ index, element ->
        if(element != l2[index]) return false
    })

    return true
}

fun similar(l1: List<Int>, l2: List<Int>): Boolean{
    l2.forEach(){
        e2 ->
        if(!l1.any {e2 == it }){
            return false
        }
    }
    return true
}

fun sumLists(l1: List<Int>, l2: List<Int>): List<Int>{
    val d = l1.zip(l2) { e1, e2 ->
        e1 + e2
    }

    return d
}

fun anonymousMathOperation(a: Int, b: Int, operation: (Int, Int) -> Double): Double{
    return operation(a, b)
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
    val num = findInsert(listOf(1,2,3,6), 4)
    println(num)
    println()
    /*****/

    /**Ej5**/
    println(equals(listOf(1, 2, 3), listOf(1, 2, 3)))
    println()
    /*****/

    /**Ej6**/
    println(similar(listOf(1, 2, 2), listOf(1, 2)))
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

    /**Ej8**/
    println(anonymousMathOperation (5, 3, ) {i, j -> i.toDouble().pow(j)})
    println(anonymousMathOperation (5, 3, ) {i, j -> (i+j).toDouble()})
    println(anonymousMathOperation (5, 3, ) {i, j -> (i-j).toDouble()})
    println()
    /********/

}