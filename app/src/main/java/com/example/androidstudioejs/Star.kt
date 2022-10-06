package com.example.androidstudioejs

class Star(name: String, distanceToEarth: Double, positionInSky: Double, isVisibleToNakedEye: Boolean, var todaySurfaceTemperature: Double, val coreTemperature: Double, val belongsTo: Galaxy?): CelestialBody(name, distanceToEarth, positionInSky, isVisibleToNakedEye) {

    override fun printName() {
        print("Star name: ")
        super.printName()
    }

    val numberOfPlanets = (0..100).random()

    fun countNumberOfPlanetsOnOrbit(): Int {
        return numberOfPlanets
    }
}