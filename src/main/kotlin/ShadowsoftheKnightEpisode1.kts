import java.util.*
import java.io.*
import java.math.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val W = input.nextInt() // width of the building.
    val H = input.nextInt() // height of the building.
    val N = input.nextInt() // maximum number of turns before game over.
    val X0 = input.nextInt()
    val Y0 = input.nextInt()
    val x: Int = 0
    val y: Int = 0

    // game loop
    while (true) {
        val bombDir = input.next() // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

        // Write an action using println()
        // To debug: System.err.println("Debug messages...");

        if (X0 < W) {
            X0+=1
        }
        if (Y0 < H) {
            Y0+=1
        }

        // the location of the next window Batman should jump to.
        println("3 7")
    }
}