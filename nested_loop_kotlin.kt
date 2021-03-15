fun main(){
    val age=20
    val layer=5
    cakeTop(age)
    cakeMiddle(age)
    cakeLayer(age,layer)
}

fun cakeTop(age:Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun cakeMiddle(age:Int){
    repeat(age+2){
        print("@")
    }
    println()
}

fun cakeLayer(age:Int,layer:Int){
    repeat(layer){
        repeat(age+2){
            print("$")
        }
        println()
    }
}

