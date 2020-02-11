package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the saveThePrisoner function below.
fun saveThePrisoner(numChairs: Long, numSweets: Long, startingChair: Long): Long {

    val awfulCandyPosition =  (numSweets + startingChair - 1) % numChairs

    if (awfulCandyPosition == 0L) {
        return numChairs
    } else {
        return awfulCandyPosition
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nms = scan.nextLine().split(" ")

        val n = nms[0].trim().toLong()

        val m = nms[1].trim().toLong()

        val s = nms[2].trim().toLong()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
