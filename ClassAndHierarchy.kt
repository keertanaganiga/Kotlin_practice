/**program that creates classes for different type of dwellings
 * shows how to:
 * create hirarchy,function and variables with inheritences 
 * absract class,ovverride and private vs. public variables
 */
import kotlin.math.PI
import kotlin.math.sqrt
fun main() {
    val squareCabin=SquareCabin(6,50.0)
    val roundHut=RoundHut(3,10.0)
    val roundTower=RoundTower(8,15.5)
    with(squareCabin){
        println("The squareCabin")
        println("The building material:${squareCabin.buildingMaterial}")
        println("The capasity:${squareCabin.capacity}")
        println("the room:${squareCabin.hasRoom()}")
        println("the floorArea:${floorArea()}")
        println()
    }
    with(roundHut){
        println("The roundHut")
        println("The building material:${roundHut.buildingMaterial}")
        println("The capasity:${roundHut.capacity}")
        println("the room:${roundHut.hasRoom()}")
        println("the floorArea:${floorArea()}")
        println("Has room? ${hasRoom()}")
		getRoom()
		println("Has room? ${hasRoom()}")
		getRoom()
        println("Carpet size: ${calculateMaxCarpetSize()}")
        println()
    }
    with(roundTower){
        println("The roundHut")
        println("The building material:${roundTower.buildingMaterial}")
        println("The capasity:${roundTower.capacity}")
        println("the room:${roundTower.hasRoom()}")
        println("the floorArea:${floorArea()}")
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }
}
/*
 * Defines properties common to all dwellings.
 */ 
    abstract class Dwelling(private var residents:Int){
        abstract val buildingMaterial:String
        abstract val capacity:Int
        abstract fun floorArea(): Double
        fun hasRoom():Boolean{
            return residents<capacity
        }
        fun getRoom(){
            if(capacity>residents){
                residents++
                println("you got room")
            }
            else{
                println("There is no room")
            }
        }
    }
    /*
     *  A square cabin dwelling.
     */
    class SquareCabin(residents:Int,val length:Double):Dwelling(residents){
        override val buildingMaterial="wood"
        override val capacity=6
        override fun floorArea(): Double{
            return length * length
        }
          
    }
    /*
     *  A round cabin dwelling.
     */
    open class RoundHut(residents:Int,val radius:Double):Dwelling(residents){
        override val buildingMaterial="straw"
        override val capacity=4
        override fun floorArea():Double{
            return PI*radius*radius
        }
        fun calculateMaxCarpetSize(): Double {
       val diameter = 2 * radius
       return sqrt(diameter * diameter / 2)
   }
    /*
     * round cabin dwelling derived from RoundHut
     */ 
    }
    class RoundTower(residents:Int,radius:Double,val floor:Int=2):RoundHut(residents,radius){
        override val buildingMaterial="stone"
        override val capacity=3*floor
        override fun floorArea():Double{
            return super.floorArea()*floor
        }
    }
