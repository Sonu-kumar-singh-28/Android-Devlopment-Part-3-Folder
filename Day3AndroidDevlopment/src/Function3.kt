fun main(){
    AsKCoffeeDetails();

    var ans =add(5,10)
    println(ans)

    println("Addition is"+add(52,2))
}

fun AsKCoffeeDetails(){
    println("Who is this Coffee For ")
    var Name = readln();
    println("How many Pieces For Sugar You Want ")
    var SugarCount = readln().toInt();

    MakeCoffe(Name, SugarCount)
}


fun MakeCoffe(Name: String,SugarCount: Int){
    if(SugarCount==1) {
        println("Coffee With $SugarCount  Spoons of Sugar For $Name")
    }else if(SugarCount==2){
        println("Coffee With $SugarCount  Spoons of Sugar For $Name")
    }
    else if(SugarCount==0){
        println("Coffee With No  Sugar For $Name")
    }else{
        println("Coffee With $SugarCount  Spoons of Sugar For $Name")
    }
}


fun add(Num1: Int, Num2: Int): Int{
    var Result= Num1+Num2;
    return  Result;
}








