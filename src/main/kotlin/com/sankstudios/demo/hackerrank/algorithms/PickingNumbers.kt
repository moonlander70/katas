package com.sankstudios.demo.hackerrank.algorithms

import java.util.*


fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    val frequencyMap = TreeMap(a.groupingBy { it }.eachCount())
    var maxCount = 0

    for ( key in frequencyMap.keys) {
        var keyCount = frequencyMap[key]!!
        var keyPlusOneCount = 0

        if (key + 1 in frequencyMap.keys) {
            keyPlusOneCount = frequencyMap[key + 1]!!
        }

        if (maxCount < keyPlusOneCount + keyCount) {
            maxCount = keyCount + keyPlusOneCount
        }

    }

    return  maxCount
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
