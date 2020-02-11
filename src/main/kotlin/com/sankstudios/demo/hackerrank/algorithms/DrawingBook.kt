package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {

    val backWardTurns = if (n % 2 == 0)  (n - p + 1) / 2  else (n - p) / 2

    val forwardTurns = p / 2

    return  minOf(backWardTurns, forwardTurns)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = pageCount(n, p)

    println(result)
}