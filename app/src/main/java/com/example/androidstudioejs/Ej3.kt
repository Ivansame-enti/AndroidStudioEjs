package com.example.androidstudioejs

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta

    /**Ej2**/
    val cb = CelestialBody("Sirius A", 10.2, 14.6, true)
    cb.printName()
    /*****/

    /**Ej3**/
    val bh = BlackHole("Sirius A", 10.2, 14.6, true, 10.0, 50.0)
    val radius = bh.calculateSchwarzschildRadius();
    println("$radius")
    /*****/

    /**Ej4**/

    /*****/

    /**Ej5**/

    /*****/

    /**Ej6**/

    /*****/
}