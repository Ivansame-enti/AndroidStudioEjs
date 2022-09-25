package com.example.androidstudioejs

class Star(name: String, distanceToEarth: Double, positionInSky: Double, isVisibleToNakedEye: Boolean, val todaySurfaceTemperature: Double, val coreTemperature: Double, val belongsTo: Galaxy?): CelestialBody(name, distanceToEarth, positionInSky, isVisibleToNakedEye) {

    override fun printName() {
        print("Star name: ")
        super.printName()
    }

    fun countNumberOfPlanetsOnOrbit(): Int {
        return (0..100).random()
    }
}