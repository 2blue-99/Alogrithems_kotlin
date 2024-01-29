package com.blue.algorithem_kotlin.backjune

lateinit var noteBook: Array<IntArray>
fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    var result = 0
    noteBook = Array(n) { IntArray(m) }

    repeat(k) {
        val (row, col) = readln().split(" ").map { it.toInt() }
        var sticker = Array(row) { IntArray(col) }

        repeat(row) {
            val gap = readln().split(" ").map { it.toInt() }.toIntArray()
            sticker[it] = gap
        }
        loop@for(rotation in 0..3) {
             for (h in 0 until n) {
                for (w in 0 until m) {
                    if (checkAttach(sticker, h, w)) {
                        result += attach(sticker, h, w)
                        break@loop
                    }
                }
            }
            sticker = rotation(sticker)
        }
    }
    println(result)
}

fun checkAttach(sticker: Array<IntArray>, sh: Int, sw: Int): Boolean {
    for (h in 0 until sticker.size) {
        for (w in 0 until sticker[0].size) {
            if(sticker[h][w]==1){
                if(h+sh >= noteBook.size || w+sw >= noteBook[0].size)
                    return false
                if(noteBook[h+sh][w+sw] == 1)
                    return false
            }
        }
    }
    return true
}

fun attach(sticker: Array<IntArray>, sh: Int, sw: Int): Int {
    var cnt = 0
    for (h in 0 until sticker.size) {
        for (w in 0 until sticker[0].size) {
            if (sticker[h][w] == 1) {
                noteBook[h + sh][w + sw] = 1
                cnt++
            }
        }
    }
    return cnt
}

fun rotation(sticker: Array<IntArray>): Array<IntArray> {
    val oldRow = sticker.size
    val oldCol = sticker[0].size
    val rotatedSticker = Array(oldCol) { IntArray(oldRow) }
    val row = rotatedSticker.size
    val col = rotatedSticker[0].size

    for (h in 0 until col) {
        for (w in 0 until row) {
            rotatedSticker[w][col - 1 - h] = sticker[h][w]
        }
    }
    return rotatedSticker
}