fun main() {
    userrequirement()
}

fun userrequirement() {
    println("Enter the first value:")
    val num1 = readln().toDouble()

    println("Enter the second value:")
    val num2 = readln().toDouble()

    val ans = DividedFun(num1, num2)
    println("The Result is : $ans")
}

fun DividedFun(num1: Double, num2: Double): Double{
    return num2 / num1
}
