fun main() {
    var myByte: Byte = 0
    var myLong: Long = 3

//default int
    var myInt: Int = 3

    var myFloat: Float = 0.0f
//default decimal
    var myDouble: Double = 0.0

//unassigned # types
    var myUnassignedInt: UInt = 0u

    var myChar: Char = 'a'
    var myString = "Hello World"

    var myBool = true

    if (myInt > 3){
        println("it's greater than 3")
    }else{
        println("it's not greater than 3")
    }

    val g = 9.8
    val myCircle = Circle(radius = 1.0, x = 2.0, y = 3.0)
    val myCircle2 = Circle(radius = 2.0, x = 3.0, y = 2.0)
    val myCircle3 = Circle(x = 2.0, y = 2.0)
    val myCircle4 = Circle(x = 3.5, y = 2.4)
}

class Circle(
    val radius: Double = 1.0,
    val x : Double = 0.0,
    val y : Double = 0.0){
}
