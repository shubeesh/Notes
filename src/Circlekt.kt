import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.pow

class Circle (
    val radius: Double = 1.0,
    val x: Double = 0.0,
    val y: Double = 0.0
){

    fun calculatorArea(): Double{
        return PI * radius.pow(2)
    }
}
