package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {

    val maxValue = ar.max()

    return ar.filter { it == maxValue }
            .count()

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
