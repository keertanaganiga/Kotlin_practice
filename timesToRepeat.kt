fun main(){
    val border="-,_.-"
    val timesToRepeat=3
    printBorder(border,timesToRepeat)
    println("BTS kpop band")
    printBorder(border,timesToRepeat)
}

fun printBorder(border:String,timesToRepeat:Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
}
