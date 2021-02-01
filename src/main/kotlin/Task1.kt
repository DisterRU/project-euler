private fun task1(): Int {
    val sumOf3 = sumBy(3)
    val sumOf5 = sumBy(5)
    val sumOf15 = sumBy(15)
    return  sumOf3 + sumOf5 - sumOf15
}

private fun sumBy(num: Int): Int {
    val countOfNums = 999 / num
    return num * (countOfNums * (countOfNums + 1)) / 2
}

fun main() {
    println(task1())
}