package com.sankstudios.demo.hackerrank.algorithms

import java.util.*


// Complete the larrysArray function below.
fun larrysArray(A: Array<Int>): String {

    // if the number of inversions are even, then it's sortable, if it's odd, it's not sortable
    var inversions = 0

    for(i in 0 until A.size) {

        for (j in i until A.size) {
            if (A[i] > A[j]) {
                inversions++
            }
        }
    }

    return when (inversions % 2 == 0) {
        true -> "YES"
        false -> "NO"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = larrysArray(A)

        println(result)
    }
}