fun main() {
    val daisy = Dog("Daisy", "Pomeranian")

    println("${daisy.name} is a ${daisy.breed} and its is ${daisy.age} year old ")

    // accessing the data and change the properties

    daisy.age = 3;
    daisy.name = "Huskey"
    daisy.breed = "None"

    println("${daisy.name} and the breed is ${daisy.breed} and the age is ${daisy.age}years old")
    
}

class Dog(var name: String, var breed: String ,var age: Int=10) {

    init {
        bark(name)
    }

    fun bark(name: String) {
        println("$name Woof Woof")
    }





}
