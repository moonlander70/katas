package com.sankstudios.demo.hackerrank.math

import java.util.*


fun handshake(n: Int): Int {
    if(n == 1) return 0

    return (1 until n step 1)
            .reduce { acc, i -> acc + i }


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = handshake(n)

        println(result)
    }
}
