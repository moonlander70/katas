package com.sankstudios.demo.hackerrank.math

import java.util.*
import kotlin.math.sqrt

/*
 * Complete the primeCount function below. This is some weird thing that the HackerRank problem was wanting.
 * Not an actual primeCount
 */
fun primeCount(n: Long): Long {

    var nLimit = if(n < 50) n else 200L

    val primeList = (2.. nLimit step 1).filter { isPrime(it)}.toList()
    var acc = 1L
    var counter = 0L

    for( d in primeList) {

        if(acc * d <= n) {
            counter++
            acc *= d
        }
        else {
            break
        }
    }

    return counter

}

/**
 * Trial Division Algorithm:
 *  for each integer x -> 2 .. sqrt(n) check if n is divisible by x
 *  if divisor, it's composite, else it's prime
 */
private fun isPrime(i: Long) : Boolean {
    if (i < 2) return false
    if (i % 2 == 0L) return (i == 2L)

    val limit = sqrt(i.toDouble()).toLong()

    return (3.. limit step 2).none { i % it == 0L}
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toLong()

        val result = primeCount(n)

        println(result)
    }
}
