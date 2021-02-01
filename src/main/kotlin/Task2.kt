private fun task2(): Int {
    var a = 0
    var b = 1
    var result = 0
    while (b < 4_000_000){
        val tmp = a + b
        a = b
        b = tmp
        if (b % 2 == 0) {
            result += tmp
        }
    }
    return result
}

fun main() {
    println(task2())
}