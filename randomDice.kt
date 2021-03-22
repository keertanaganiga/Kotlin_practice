fun main(){
    val myFirstDice=Dice(6)
    println("your ${myFirstDice.numSides} sidded rolled ${myFirstDice.roll()}")
    val mySecondDice=Dice(6)
    println("your ${mySecondDice.numSides} sidded rolled ${mySecondDice.roll()}")
}

class Dice(val numSides:Int){
    var sides=6
    
    fun roll(): Int{
        return (1..numSides).random()
    }
}
