package com.example.androidstudioejs

class BlackHole(name: String, distanceToEarth: Double, positionInSky: Double, isVisibleToNakedEye: Boolean, val rotationVelocity: Double, val mass: Double): CelestialBody(name, distanceToEarth, positionInSky, isVisibleToNakedEye) {

    fun calculateSchwarzschildRadius(): Double? {
        if(rotationVelocity==0.0) return null
        else{
            return (2*mass*6.67*Math.pow(10.0, -11.0))/Math.pow((3*Math.pow(10.0, 8.0)), 2.0)
        }
    }
}