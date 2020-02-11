package com.sankstudios.demo.hackerrank.algorithms

import java.util.*

// Complete the almostSorted function below.
fun almostSorted(A: Array<Int>) {
    var leftIndex = 0
    var rightIndex = 0
    var swaps = 0


    // get the first out of order Left index
    for (i in 0 until A.size - 1) {
        if (A[i] > A[i + 1]) {
            leftIndex = i
            break
        }
    }

    // Get the first out of order right index
    for (j in A.size - 1 downTo 1) {
        if (A[j] < A[j - 1]) {
            rightIndex = j
            break
        }
    }

    var l = leftIndex
    var r = rightIndex


    // In the out of order sub-section, do swaps where the left is greater than the right
    while (r  > l) {
        if(A[l] > A[r]) {
            swaps += 1
            A[r] = A[l].also { A[l] = A[r] }
        }

        r -= 1
        l += 1

    }

    // is it sorted now?
    var sorted = checkSorted(A)

    if (sorted) {

        var far_left = leftIndex + 1
        var far_right = rightIndex + 1


        // if only one swap was needed, then it's a Swap operation
        if (swaps == 1) {
            println("yes")
            println("swap $far_left $far_right")


        // if all elements in between were swapped, it's a reverse..
            // as a Swap is 1 operation for 2 elements, you divide number of elements in between by 2
        } else if (swaps == (rightIndex - leftIndex + 1) / 2) {
            println("yes")
            println("reverse $far_left $far_right")
        }

    } else {
        println("no")
    }

}

fun checkSorted(A: Array<Int>) : Boolean {

    for (i in 0 until A.size - 1) {
        if (A[i] > A[i + 1]) {
            return false
        }
    }

    return true
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    almostSorted(arr)
}
