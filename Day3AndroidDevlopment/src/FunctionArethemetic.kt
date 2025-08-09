fun main() {
    userRequirement()
}

fun userRequirement() {
    println("Enter the first value:")
    val num1 = readln().toInt()

    println("Enter the second value:")
    val num2 = readln().toInt()

    val ans = addSum(num1, num2)
    println("The Result is : $ans")
}

fun addSum(num1: Int, num2: Int): Int {
    return num1 + num2
}
