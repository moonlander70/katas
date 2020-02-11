package com.sankstudios.demo.other


fun main(args: Array<String>) {
    var a = 1.0
    var aPrev : Double
    var b = 1.0 / Math.sqrt(2.0)
    var p = 1.0
    var t = 0.25
    var pi = 0.0

    while (Math.abs(a - b) > 0.001) {
        aPrev = a
        a = (a + b) / 2.0

        b = Math.sqrt(aPrev * b)

        t -= p * Math.pow((aPrev - a), 2.0)

        p *=  2.0

        pi = Math.pow((a + b), 2.0) / (4.0 * t)
    }

    println(pi)

}


