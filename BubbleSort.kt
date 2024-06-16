package BubbleSort.Algorithms

fun main() {
    val arr = intArrayOf(12, 30, 20, 43, 55, 67);
    val expected = intArrayOf(12, 20, 30, 43, 55, 67)
    bubbleSort(arr)
    println(arr.contentToString())
    //assertArrayEquals(expected, arr)
}

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap the elements
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}