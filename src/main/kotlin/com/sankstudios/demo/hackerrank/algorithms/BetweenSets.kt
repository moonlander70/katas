package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

/*
 * Complete the com.sankstudios.demo.hackerrank.algorithms.getTotalX function below.
// */
fun getTotalX(a: Array<Long>, b: Array<Long>): Int {

    val lcmA = lcmArray(a)

    // find the GCD of array b
    val gcdB = gcdArray(b)

    if (lcmA > gcdB) return 0

    return (lcmA.. gcdB step lcmA).count{ gcdB % it == 0L}
}

fun lcmArray(array: Array<Long>) : Long {

    var result = array[0]

    for (i in 1 until array.size) result = lcm(result, array[i])

    return result

}

fun gcdArray(array: Array<Long>) : Long {
    var result : Long = 0

    for( i in 0 until array.size) result = gcd(result, array[i])

    return result
}

fun lcm(x: Long, y: Long): Long {
    return (x / gcd(x, y)) * y
}

fun gcd(x: Long, y: Long): Long {
    if (y == 0L)
        return x
    if (x < 0)
        return gcd(x * -1, y) //turns the first parameter to a positive if it's initally negative
    if (y < 0)
        return gcd(x, y * -1) //turns the second parameter to a positive if it's initally negative
    if (y <= x && x % y == 0L)
        return y

    return gcd(y, x % y)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toLong()

    val m = nm[1].trim().toLong()

    val a = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val b = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val total = getTotalX(a, b)

    println(total)
}
