package com.sankstudios.demo.hackerrank.algorithms

import java.math.BigInteger
import java.util.*

// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Long): Unit {

    val result = (1.. n step  1)
            .map { BigInteger.valueOf(it) }
            .reduce { acc, l -> l.multiply(acc)}

    println(result)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toLong()

    extraLongFactorials(n)
}