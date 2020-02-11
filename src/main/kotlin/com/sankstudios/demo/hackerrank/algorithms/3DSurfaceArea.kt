package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the surfaceArea function below.
fun surfaceArea(A: Array<Array<Int>>): Int {

    var surfaceAreaCount = (2 * A.size * A[0].size)

    for(i in 0 until A.size) {
        for(j in 0 until A[i].size) {

            val currentNodeValue = A[i][j]
            val leftNodeValue = if(i == 0) 0 else A[i - 1][j]
            val rightNodeValue = if(i + 1 == A.size) 0 else A[i + 1][j]
            val southNodeValue = if(j == 0) 0 else A[i][j - 1]
            val northNodeValue = if(j + 1 == A[i].size) 0 else A[i][j + 1]

            if (currentNodeValue > leftNodeValue) surfaceAreaCount += currentNodeValue - leftNodeValue

            if (currentNodeValue > rightNodeValue) surfaceAreaCount += currentNodeValue - rightNodeValue

            if (currentNodeValue > northNodeValue) surfaceAreaCount += currentNodeValue - northNodeValue

            if (currentNodeValue > southNodeValue) surfaceAreaCount += currentNodeValue - southNodeValue

        }
    }

    return surfaceAreaCount

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val HW = scan.nextLine().split(" ")

    val H = HW[0].trim().toInt()

    val W = HW[1].trim().toInt()

    val A = Array<Array<Int>>(H, { Array<Int>(W, { 0 }) })

    for (i in 0 until H) {
        A[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = surfaceArea(A)

    println(result)
}
