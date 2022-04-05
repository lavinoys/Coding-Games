import java.util.*
import java.io.*
import java.math.*

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    // game loop
    while (true) {
        val map: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0 until 8) {
            map[i] = input.nextInt() // represents the height of one mountain.
        }
        val tallestMountain: Pair<Int, Int> = map.toList().maxByOrNull { (_, value) -> value }!!
        System.err.println("mountain : ${tallestMountain.first}, size : ${tallestMountain.second}")
        println(tallestMountain.first) // The index of the mountain to fire on.
    }
}
