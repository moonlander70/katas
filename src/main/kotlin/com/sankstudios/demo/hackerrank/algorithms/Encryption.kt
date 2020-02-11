package com.sankstudios.demo.hackerrank.algorithms

import java.util.*
import kotlin.collections.ArrayList

// Complete the encryption function below.
fun encryption(s: String): String {
    val sWithoutWhite = s.filterNot { it.isWhitespace() }
    var rows = Math.floor(Math.sqrt(sWithoutWhite.length.toDouble())).toInt()
    val colSize = Math.ceil(Math.sqrt(sWithoutWhite.length.toDouble())).toInt()

    if (rows * colSize < sWithoutWhite.length) {
        rows = colSize
    }

    val list = ArrayList<String>()

    for (j in 0 until colSize) {

        var tmp = ""

        for (i in 0 until rows) {

            if (sWithoutWhite.getOrNull(i * colSize + j) != null) {

                tmp += sWithoutWhite[i * colSize + j]

            }
        }

        list.add(tmp)

    }

    return list.reduce { acc, it -> "$acc $it" }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)

}