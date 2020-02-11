package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the circularArrayRotation function below.
fun circularArrayRotation(array: Array<Int>, numRotations: Int, queries: Array<Int>): Array<Int> {

    val mutableArray = IntArray(array.size)

    val netRotations = numRotations % array.size

    for(i in 0 until netRotations) {

        mutableArray[netRotations -1 - i] = array[array.size -1 - i]
    }

    for(j in netRotations until array.size) {
        mutableArray[j] = array[netRotations - j]
    }

    return queries
            .map { mutableArray[it] }
            .toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nkq = scan.nextLine().split(" ")

    val n = nkq[0].trim().toInt()

    val k = nkq[1].trim().toInt()

    val q = nkq[2].trim().toInt()

    val array = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val queries = Array<Int>(q, { 0 })
    for (i in 0 until q) {
        val queriesItem = scan.nextLine().trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(array, k, queries)

    println(result.joinToString("\n"))
}