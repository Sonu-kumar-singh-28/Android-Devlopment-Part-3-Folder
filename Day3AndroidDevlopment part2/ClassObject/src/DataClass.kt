import javax.swing.SizeRequirements

data class CoffeeDetails(val Sugarcount: Int, val Name: String , val size: String, val creamamount: Int)

fun main() {
    val coffeeForSonu = CoffeeDetails(0, "Sonu singh Sengar", "XXl", 0)
    MakeCoffee(coffeeForSonu)
}


    fun MakeCoffee(coffeeDetails: CoffeeDetails) {
        if (coffeeDetails.Sugarcount == 1) {
            println("Coffee With ${coffeeDetails.Sugarcount} "+"Spoons of Sugar for ${coffeeDetails.Name}")
        } else if (coffeeDetails.Sugarcount == 2) {
            println("Coffee With ${coffeeDetails.Sugarcount} "+"Spoons of Sugar for ${coffeeDetails.Name}")
        } else if (coffeeDetails.Sugarcount == 3) {
            println("Coffee With ${coffeeDetails.Sugarcount} "+"Spoons of Sugar for ${coffeeDetails.Name}")
        } else {
            println("Coffee With ${coffeeDetails.Sugarcount} "+"Spoons of Sugar for ${coffeeDetails.Name}")

        }
    }

