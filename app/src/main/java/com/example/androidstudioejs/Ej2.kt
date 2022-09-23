package com.example.androidstudioejs

fun nullSafetySum(a: Int?, b: Int?): Int{
    /*var c = 0
    var d = 0
    if(a!=null) c=a
    if(b!=null) d=b*/
    //return c+d
    return (a?: 0) + (b?: 0)
}

fun nullSafetyAverage(list: List<Int?>?): Double{
    if(list==null)
        return 0.0
    else {
        var media = 0
        var size = 0
        for(i in 0 until list.size){
            media+=list[i] ?: 0
            if(list[i] != null) {
                size++
            }
        }
        return media.toDouble()/size
    }
}

fun nullControlAverage(list: List<Int?>?): Double?{
    if(list==null)
        return null
    else {
        var media = 0
        var size = 0
        for(i in 0 until list.size){
            media+=list[i] ?: 0
            if(list[i] != null) {
                size++
            } else return null
        }
        return media.toDouble()/size
    }
}

fun printOnlyOdds(list: List<Int?>){
    for(i in 0 until list.size){
        //if(list[i] != null) {
        if(list[i]?.rem(2) ?:0  == 1)print("${list[i]}, ")
        //}
    }
}

fun replaceNulls(matrix: List<List<Int?>>): List<List<Int>>{
    var longestSize: Int = 0

    for(i in matrix.indices){
        if(matrix[i].size > longestSize) longestSize = matrix[i].size
    }

    var matrix2 : MutableList<MutableList<Int>> = MutableList(matrix.size){MutableList(longestSize){9} }

    for(i in matrix.indices){
        for(j in matrix[i].indices) {
            matrix2[i][j] = (matrix[i][j] ?: (0..100).shuffled().last())
        }
    }

    for(i in matrix.indices){
        if(matrix2[i].size > matrix[i].size) do {matrix2[i].removeLast()} while (matrix2[i].size > matrix[i].size)

    }

    return matrix2
}

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta

    /**Ej2**/
    println("Ej2: ")
    val a: Int? = 2
    val b: Int? = null
    val c = nullSafetySum(a, b)
    print(c) // Ha d’imprimir 2
    println()
    println()
    /*****/

    /**Ej3**/
    println("Ej3: ")
    val l1: List<Int?>? = listOf(6,4,5,null)
    print(nullSafetyAverage(l1))
    println()
    println()
    /*****/

    /**Ej4**/
    println("Ej4: ")
    val l2: List<Int?>? = listOf(6,4,5)
    val avg : Double? = nullControlAverage(l2)
    print(avg)
    println()
    println()
    /*****/

    /**Ej5**/
    println("Ej5: ")
    val l3: List<Int?> = listOf(6,4,5, 7, 3, 2)
    printOnlyOdds(l3)
    println()
    println()
    /*****/

    /**Ej6**/
    println("Ej6: ")
    val matrix: List<List<Int?>> = listOf(listOf(1,2,3), listOf(4, null, 6))
    val matrix2: List<List<Int>> = replaceNulls(matrix)

    //Printa la matriz al reves
    for(i in (matrix2.size-1) downTo 0){
        for(j in (matrix2[i].size-1) downTo 0){

            val elem = matrix2[i][j]
            print("$elem, ")
        }
        println()
    }

    println()
    /*****/
}