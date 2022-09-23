package com.example.androidstudioejs

fun intercala(l1: List<Int>,  l2: List<Int>){
    val size = if(l1.size > l2.size) l2.size
    else l1.size

    for(i in 0 until size){
        //if(i%2==0) println(l1[i])
        //else println(l2[i])
        print("${l1[i]}, ${l2[i]}, ")
    }
}

fun reves(list: List<Any>){
    var j = list.size-1

    while(j>=0){
        print("${list[j]}, ")
        j--
    }
}

fun revesMatrix(list: List<List<Any>>){
    /*var j = list.size-1

    while(j>=0){
        print("${list[j]}, ")
        j--
    }*/

    for(i in (list.size-1) downTo 0){
        for(j in (list[i].size-1) downTo 0){

            val elem = list[i][j]
            print("$elem, ")
        }
        println()
    }

}

fun saluda(nombre: String){
    println("Hola, $nombre")
}

fun printTwoInts(a: Int, b: Int){
    println("$a-$b")
}

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta
    /**Ej1**/
    println("Ej1: ")
    saluda("Ivan")
    println()
    /*****/

    /**Ej2**/
    println("Ej2: ")
    printTwoInts(7,5)
    println()
    /*****/

    /**Ej3**/
    println("Ej3: ")
    val l1 = listOf(1,2,3)
    val l2 = listOf(4,5,6)
    intercala(l1, l2)
    println()
    println()
    /*****/

    /**Ej4**/
    println("Ej4: ")
    val l3 = listOf<Any>(1,2,"Hola", 0.0)
    reves(l3)
    println()
    println()
    /*****/

    /**Ej5**/
    println("Ej5: ")
    val matrix: List<List<Any>> = listOf(listOf(1,2,3), listOf("Hola", "Adios", 6))
    revesMatrix(matrix)
    println()
    /*****/
}
