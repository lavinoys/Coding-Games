import java.util.*
import java.io.*
import java.math.*
import kotlin.math.abs

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val n = input.nextInt() // the number of temperatures to analyse

    if (n == 0) {
        println("0")
    } else {
        var min = Int.MAX_VALUE
        for (i in 0 until n) {
            val t = input.nextInt() // a temperature expressed as an integer ranging from -273 to 5526
            if (abs(t) < abs(min) || (t == -min && t > 0)) {
                min = t
            }
        }
        println(min)
    }
}
