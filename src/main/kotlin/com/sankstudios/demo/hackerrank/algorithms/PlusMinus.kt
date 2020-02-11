package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>) {

    val positiveCount = arr.count { it > 0 }
    val negativeCount = arr.count { it < 0 }
    val zeroCount = arr.count {  it == 0 }


    println( positiveCount.toDouble() / arr.size.toDouble())
    println( negativeCount.toDouble() / arr.size.toDouble())
    println( zeroCount.toDouble() / arr.size.toDouble())

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}