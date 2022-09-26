package com.example.androidstudioejs

fun makeSomeDangerousCalc(): Int {
    val randomNumber =(0..100).random()
    return if (randomNumber > 50) randomNumber else throw ArithmeticException()
}

fun callDangerousCalc(): Int {
    try {
        return makeSomeDangerousCalc()
    } catch (e: ArithmeticException) {
        return -1
    }
}

fun callDangerousCalcLoop(): Int {
    try {
        return makeSomeDangerousCalc()
    } catch (e: ArithmeticException) {
        return callDangerousCalcLoop()
    }
}

fun filterByIndex(list: List<Any>, indexs: List<Int?>): List<Any>{
    var l: List<Any> = listOf()
    val size = indexs.size

    for(i in 0 until size){
        try {
            l += list[indexs[i]?:continue]
        }catch (e: ArrayIndexOutOfBoundsException) {
            continue
        }
    }

    return l
}

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta

    /**Ej1**/
    println(callDangerousCalc())
    println()
    println(callDangerousCalcLoop())
    println()
    /*****/

    /**Ej2**/
    val l = filterByIndex(listOf("a","b", "c", "d"), listOf(1, null, 5, 3))
    for(i in 0 until l.size){
        print("${l[i]}, ")
    }
    println()
    /*****/

    /**Ej3**/

    /*****/
}