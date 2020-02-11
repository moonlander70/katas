package com.sankstudios.demo.hackerrank.algorithms

import java.util.*


// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    when (v2 >= v1) {
        true -> return "NO"
    }

    var n = 0

    while ( (x1 + n * v1) < (x2 + n * v2)) {
        n++
    }

    when ((x1 + n * v1) == (x2 + n * v2)) {
        true -> return "YES"
        false -> return "NO"
    }

    // This can be done in O(1) ... think about it using algebra.
    // result = (x2 - x1) % (v1 - v2)
    // if result == 0  then "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
