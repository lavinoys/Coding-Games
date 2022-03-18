import java.util.*
import java.io.*
import java.math.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)

    // game loop
    while (true) {
        val x = input.nextInt()
        val y = input.nextInt()
        val nextCheckpointX = input.nextInt() // x position of the next check point
        val nextCheckpointY = input.nextInt() // y position of the next check point
        val nextCheckpointDist = input.nextInt() // distance to the next checkpoint
        val nextCheckpointAngle = input.nextInt() // angle between your pod orientation and the direction of the next checkpoint
        val opponentX = input.nextInt()
        val opponentY = input.nextInt()

        // Write an action using println()
        // To debug: System.err.println("Debug messages...");

        var thrust:Int = 0
        if(nextCheckpointAngle > 70 || nextCheckpointAngle < -70) {
            thrust = 0
        } else {
            if (nextCheckpointDist > 5) {
                thrust = 95
            } else if (nextCheckpointDist > 3) {
                thrust = 98
            } else {
                thrust = 100
            }
        }
        // You have to output the target position
        // followed by the power (0 <= thrust <= 100)
        // i.e.: "x y thrust"
        /*if (thrust == 100) {
            println("$nextCheckpointX $nextCheckpointY BOOST")
        } else {
            println("$nextCheckpointX $nextCheckpointY $thrust")
        }*/
        println("$nextCheckpointX $nextCheckpointY BOOST")
    }
}
