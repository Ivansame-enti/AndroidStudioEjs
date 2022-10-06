package com.example.androidstudioejs
import kotlin.random.Random

operator fun Boolean.plus(other: Boolean): Boolean = this or other

operator fun Boolean.times(other: Boolean): Boolean = this and other

data class Estudiant(val nom: String, val edat: Int, val altura:Double) : Comparable<Estudiant>{
    override fun compareTo(other: Estudiant) = edat.compareTo(other.edat)
}

fun agrupa(obj: List<Estudiant>, count: List<Int>): List<Pair<Estudiant, Int>>{
    val mixedList: MutableList<Pair<Estudiant, Int>> = mutableListOf(Pair(obj[0], count[0]))
    for(i in 1 until obj.size){
        mixedList.add(Pair(obj[i], count[i]))
    }

    return mixedList
}

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta

    /**Ej1**/
    println(true+true)
    println(true+false)
    println(false+true)
    println(false+false)
    println()
    println(true*true)
    println(true*false)
    println(false*true)
    println(false*false)
    println()
    /*****/

    /**Ej2**/
    val dataClass = Estudiant("Marga", 23, 1.72)
    val dataClass2 = Estudiant("Montse", 16, 1.60)
    val dataClass3 = Estudiant("Jaime", 25, 1.76)
    val classE = EstudiantClass("Pepe", 32, 1.67)
    println(dataClass)
    println(classE)
    println()

    println("[${dataClass > dataClass2}]")
    println("[${dataClass > dataClass3}]")
    println()

    operator fun Estudiant.plus(other: Estudiant) = Estudiant("Aleatori", (9..60).random(), Random.nextDouble(1.5, 2.1))

    val dataClass4 = dataClass + dataClass2
    println(dataClass4)
    println()

    val list = agrupa(listOf(dataClass,dataClass2,dataClass3), listOf(1,2,3))
    for(i in 0 until list.size){
        print("${list[i]}, ")
    }
    println()
    /*****/
}