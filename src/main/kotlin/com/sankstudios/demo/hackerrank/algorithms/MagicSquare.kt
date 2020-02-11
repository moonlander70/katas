package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

val all_n = listOf(
        intArrayOf(8, 1, 6, 3, 5, 7, 4, 9, 2),
        intArrayOf(6, 1, 8, 7, 5, 3, 2, 9, 4),
        intArrayOf(4, 9, 2, 3, 5, 7, 8, 1, 6),
        intArrayOf(2, 9, 4, 7, 5, 3, 6, 1, 8),
        intArrayOf(8, 3, 4, 1, 5, 9, 6, 7, 2),
        intArrayOf(4, 3, 8, 9, 5, 1, 2, 7, 6),
        intArrayOf(6, 7, 2, 1, 5, 9, 8, 3, 4),
        intArrayOf(2, 7, 6, 9, 5, 1, 4, 3, 8))

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: IntArray): Int {
    // val magicConstant = s.size * ((s.size*s.size + 1) / 2)  - not needed

    return all_n.map {
                            var sum = 0
                            for(i in 0 until s.size) {
                                sum += Math.abs(s[i] - it[i])
                            }
                            sum
    }.toCollection(ArrayList<Int>())
    .min()?:0

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s.flatten().toIntArray())

    println(result)
}
