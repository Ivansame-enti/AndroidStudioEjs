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

fun cut(list: List<Any>, ini: Int = 0, end: Int =  list.size): List<Any>{
    var l: List<Any> = listOf()
    var inicial = ini
    var final = end

    if(ini>=end) return l

    if(ini<0) inicial=0
    if(end>list.size) final=list.size

    for(i in inicial until final+1){
        try {
            l += list[i]
        }catch (e: ArrayIndexOutOfBoundsException) {
            break
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
    println()
    /*****/

    /**Ej3**/
    var list: List<Any>
    list = cut(listOf("a", "b", "c", "d"))

    for(i in 0 until list.size){
        print("${list[i]}, ")
    }
    println()

    list = cut(listOf("a", "b", "c", "d"), 1, 3)
    for(i in 0 until list.size){
        print("${list[i]}, ")
    }
    println()

    list = cut(listOf("a", "b", "c", "d"),end=3)
    for(i in 0 until list.size){
        print("${list[i]}, ")
    }
    println()

    list = cut(listOf("a", "b", "c", "d"),ini=3)
    for(i in 0 until list.size){
        print("${list[i]}, ")
    }
    println()

    list = cut(listOf("a", "b", "c", "d"),-1,10)
    for(i in 0 until list.size){
        print("${list[i]}, ")
    }
    println()
    /*****/
}