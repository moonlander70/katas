package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the marsExploration function below.
fun marsExploration(s: String): Int {

    var count = 0
    val chunked = s.chunked(3).filter { !it.contentEquals("SOS") }.toList()

    chunked.forEach { it.toCharArray()
        if (it[0] != 'S') count++
        if(it[1] != 'O') count ++
        if(it[2] != 'S') count ++
    }

    return count

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = marsExploration(s)

    println(result)
}
