package com.example.androidstudioejs


fun findTheFarthest(celestialBodies: List<CelestialBody>): CelestialBody{
    val size = celestialBodies.size
    var aux = celestialBodies[0]
    for(i in 0 until size){
        if(celestialBodies[i].distanceToEarth > aux.distanceToEarth) aux = celestialBodies[i]
    }
    return aux
}

//fun filterByGalaxy(stars: List<Star?>, galaxy: Galaxy): List<Star>{
//    val size = stars.size
//    val list : List<Star>
//    for(i in 0 until size){
//        if(stars[i]?.belongsTo == galaxy) list+=stars[i]
//    }
//    return list
//}

fun main() {
    //Control + barra de comentar con codigo subrayado -> lo comenta

    /**Ej2**/
    val cb = CelestialBody("Sirius A", 7.2, 14.6, true)
    cb.printName()
    println()
    /*****/

    /**Ej3**/
    val bh = BlackHole("Agujero 1", 5.2, 14.6, true, 10.0, 50.0)
    val radius = bh.calculateSchwarzschildRadius();
    println("$radius")
    println()
    /*****/

    /**Ej4**/
    val star = Star("Estrella 1", 10.2, 14.6, true, 58.3, 120.5, null)
    star.printName()
    println()
    /*****/

    /**Ej5**/
    println(star.countNumberOfPlanetsOnOrbit())
    println()
    /*****/

    /**Ej6**/
    val galaxy = Galaxy("Galaxia 1", 1.2, 14.6, true, 49, 37.0)
    val list = listOf<CelestialBody>(cb, bh, star, galaxy)
    println(findTheFarthest(list).name)
    println()
    /*****/

    /**Ej7**/
    val star2 = Star("Estrella 2", 32.2, 78.6, true, 58.3, 120.5, galaxy)
    val star3 = Star("Estrella 3", 32.2, 78.6, true, 58.3, 120.5, null)
    val star4 = Star("Estrella 4", 32.2, 78.6, true, 58.3, 120.5, galaxy)
    /*****/

    /**Ej7**/
    val starList = listOf<Star?>(star, star2, star3, star4)
    //val starListOnGalaxy =filterByGalaxy(starList, galaxy)
    /*****/
}