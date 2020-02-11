package com.sankstudios.demo.hackerrank.algorithms

import java.time.LocalDate
import java.time.format.DateTimeFormatter

// Day of programmer, 256th day of each year
// from 1700 - 1917, Julian Calendar in Russia
// from 1919, Gregorian Calendar
// 1918, transition ... Jan 31, Feb 14
//


// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val format = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    val isLeapYearGregorian = LocalDate.ofYearDay(year, 1).isLeapYear

    return when {
        year in 1919.. 2700 ->  LocalDate.ofYearDay(year, 256).format(format).toString()
        year in 1700.. 1917 && year % 4 == 0 && !isLeapYearGregorian -> LocalDate.ofYearDay(year, 255).format(format)
        year in 1700.. 1917 -> LocalDate.ofYearDay(year, 256).format(format)
        year == 1918 ->   LocalDate.ofYearDay(year, 256 + 13).format(format)
        else ->  ""
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
