fun main(){
    val FirstDice=Dice(6)
    val rollResult=FirstDice.roll()
    val luckyNumber=4
    
    when (rollResult) {
    luckyNumber ->print("YOU WIN!")
    1->print("you rolled 1,try again")
    2->print("you rolled 2,try again")
    3->print("you rolled 3,try again")
    4->print("you rolled 4,try again")	
    5->print("you rolled 5,try again")
    6->print("you rolled 6,try again")
}
}

class Dice(val sides:Int){
    fun roll():Int{
        return (1..sides).random()
    }
}
