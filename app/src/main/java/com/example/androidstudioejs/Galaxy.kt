package com.example.androidstudioejs

class Galaxy(name: String, distanceToEarth: Double, positionInSky: Double, isVisibleToNakedEye: Boolean, val numberOfStars: Int, var currentLuminosity: Double): CelestialBody(name, distanceToEarth, positionInSky, isVisibleToNakedEye) {

}