package extensionFunction

fun ArrayList<Int>.swapByJerry(idxA: Int, idxB: Int) {
    val temp = this[idxA]
    this[idxA] = this[idxB]
    this[idxB] = temp
}

fun main(args: Array<String>) {
    val array = arrayListOf(1, 3, 5, 7)
    array.swapByJerry(1, 3)
    println(array)
}

