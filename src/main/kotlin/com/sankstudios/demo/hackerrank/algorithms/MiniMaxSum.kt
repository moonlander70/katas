package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    val arr2 = arr.sortedArray()

    var min : Long = 0
    var max : Long = 0

    for( index in 0 until  4) {
        min += arr2[index]
        max += arr2[arr.size -1 - index]
    }

    println("$min $max")

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
