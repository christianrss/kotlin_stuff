package BinarySearch.Algorithms

import kotlin.text.*

fun main() {
    val input = readLine()!!.trim().split(" ").map{ it -> it.toInt() }.toIntArray()
    val eleToSearch = readLine()!!.trim().toInt()
    val pos = binarySearchInterative(input, eleToSearch)
    if (pos >= 0) {
        println(pos)
    } else {
        println("Position not found")
    }
}

fun binarySearchInterative(input: IntArray, eleToSearch: Int) : Int {
    var low = 0
    var high = input.size -1
    var mid: Int
    while(low <= high) {
        mid = low + ((high - low) / 2)
        when {
            eleToSearch > input[mid] -> low = mid + 1
            eleToSearch == input[mid] -> return mid
            eleToSearch < input[mid] -> high = mid - 1
        }
    }
    return -1
}