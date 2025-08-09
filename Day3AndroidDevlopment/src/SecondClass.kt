fun main(){
    var daisy = Dog("Daisy")
}

// constructor
class Dog(val Name: String){

    init{
        Bark(Name)
    }

    fun  Bark(Name: String){
        println("${Name} WooF Woff")
    }
}
