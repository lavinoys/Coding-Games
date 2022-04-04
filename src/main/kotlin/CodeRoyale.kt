import java.util.*
import java.io.*
import java.math.*
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val numSites = input.nextInt()
    for (i in 0 until numSites) {
        val siteId = input.nextInt()
        val x = input.nextInt()
        val y = input.nextInt()
        val radius = input.nextInt()
    }

    var emptySiteId: Int = -1
    var myBarracks: MutableList<Int>
    var trainBarracks: MutableList<Int>
    // game loop
    while (true) {
        val gold = input.nextInt()
        val touchedSite = input.nextInt() // -1 if none
        myBarracks = mutableListOf()
        trainBarracks = mutableListOf()
        var knightCnt = 0
        var archerCnt = 0

        for (i in 0 until numSites) {
            val siteId = input.nextInt()
            val ignore1 = input.nextInt() // used in future leagues
            val ignore2 = input.nextInt() // used in future leagues
            val structureType = input.nextInt() // -1 = No structure, 2 = Barracks
            val owner = input.nextInt() // -1 = No structure, 0 = Friendly, 1 = Enemy
            val param1 = input.nextInt()
            val param2 = input.nextInt() // 0 for KNIGHT, 1 for ARCHER
//            System.err.println("siteId:$siteId | ignore1:$ignore1 | ignore2:$ignore2 | structureType:$structureType | owner:$owner | param1:$param1 | param2:$param2")
            if (structureType == -1 && owner == -1) {
                emptySiteId = siteId
            }
            if (owner == 0 && structureType == 2) {
                myBarracks.add(siteId)
                if (param1 == 0) {
                    trainBarracks.add(siteId)
                }
                if (param2 == 0) {
                    knightCnt += 1
                } else {
                    archerCnt += 1
                }
            }
        }
        val numUnits = input.nextInt()
        var queenX = 0
        var queenY = 0
        for (i in 0 until numUnits) {
            val x = input.nextInt()
            val y = input.nextInt()
            val owner = input.nextInt() // 0 : MY, 1 : ENEMY
            val unitType = input.nextInt() // -1 = QUEEN, 0 = KNIGHT, 1 = ARCHER
            val health = input.nextInt()
//            System.err.println("x:$x | y:$y | owner:$owner | unitType:$unitType | health:$health")
            if (owner == 0 && unitType == -1) {
                queenX = x
                queenY = y
            }
        }

        // First line: A valid queen action
        // Second line: A set of training instructions
        // BUILD {siteId} BARRACKS-{type}
        // KNIGHT or ARCHER
        // BUILD 2 BARRACKS-KNIGHT

        System.err.println("touchedSite:$touchedSite")
        if (touchedSite > -1 && myBarracks.none { it == touchedSite }) {
            if (archerCnt < 3) {
                println("BUILD $emptySiteId BARRACKS-ARCHER")
            } else if(knightCnt < 5) {
                println("BUILD $emptySiteId BARRACKS-KNIGHT")
            } else {
                println("WAIT")
            }
        } else {
            if (myBarracks.none { it == emptySiteId }) {
                if (archerCnt < 3) {
                    println("BUILD $emptySiteId BARRACKS-ARCHER")
                } else if(knightCnt < 5) {
                    println("BUILD $emptySiteId BARRACKS-KNIGHT")
                } else {
                    println("WAIT")
                }
            } else {
                println("WAIT")
            }
        }
        if (trainBarracks.size > 0) {
            println("TRAIN ${trainBarracks.first()}")
        } else {
            println("TRAIN")
        }
    }
}
