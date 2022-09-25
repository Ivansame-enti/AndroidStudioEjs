package com.example.androidstudioejs

open class CelestialBody(val name: String, val distanceToEarth: Double, val positionInSky: Double, val isVisibleToNakedEye: Boolean) {

    init {
        // El bloc init() és el constructor.
        // S’encarrega d’inicialitzar la classe cada vegada que es crea una instància
    }

    open fun printName() {
        println("$name");
    }

}
