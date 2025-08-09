fun main() {
    val daisy = Dog("Daisy", "Pomeranian")
}

class Dog(val name: String, val breed: String) {

    init {
        bark()
    }

    private fun bark() {
        println("$name Woof Woof")
    }
}
