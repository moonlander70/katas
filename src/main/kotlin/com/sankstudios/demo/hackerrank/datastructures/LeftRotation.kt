package com.sankstudios.demo.hackerrank.datastructures

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val arr1 = IntArray(a.size)

    for (i in 0 until a.size) {

        arr1[(i + n - d) % n] = a[i]
    }

    val result = arr1.map { it.toString() }.reduce{ a, i -> "$a $i"}

    println(result)
}
