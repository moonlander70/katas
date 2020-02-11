package com.sankstudios.demo.hackerrank.algorithms

import java.text.*
import java.util.*


/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {

    val format = SimpleDateFormat("hh:mm:ssaa")

    val militaryFormat = SimpleDateFormat("HH:mm:ss")

    return militaryFormat.format(format.parse(s))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
