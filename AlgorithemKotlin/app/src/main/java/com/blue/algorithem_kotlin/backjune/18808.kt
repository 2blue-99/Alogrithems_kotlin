package com.blue.algorithem_kotlin.backjune

lateinit var noteBook: Array<IntArray>
fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    noteBook = Array(n) { IntArray(m) }
    var h = 0
    var w = 0
    repeat(k) {
        val (row, col) = readln().split(" ").map { it.toInt() }
        var sticker = Array(row) { IntArray(col) }
        var tempSticker = Array(row) { IntArray(col) }

        repeat(row) {
            val gap = readln().split(" ").map { it.toInt() }.toIntArray()
            sticker[it] = gap
            tempSticker[it] = gap
        }
        println("이번에 들어온 스티커")
        sticker.forEach { println(it.contentToString()) }

        loop@ while (h<n) {
            while (w < m) {
                if(noteBook[h][w] == 0)
                    for (i in 0..3) {
                        if (checkAttach(sticker, h, w)) {
                            w += attach(sticker, h, w)
                            break@loop
                        } else {
                            if (i == 3) break
//                        if(!checkSticker(sticker,h,w)) continue
                            sticker = rotation(sticker)
                        }
                    }
                w += 1
            }
            w = 0
            h += 1
        }
        tempSticker = sticker
        noteBook.forEach { println(it.contentToString()) }
        println()
    }
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

//fun checkSticker(sticker: Array<IntArray>, sh: Int, sw: Int): Boolean {
//    return if(noteBook[0].size-sh < sticker.size || noteBook.size - sw < sticker[0].size )
//        false
//    else
//        true
//    if (noteBook[0].size - sh < sticker.size || noteBook.size - sw < sticker[0].size) return false
//
//    for (h in sh until sticker.size) {
//        for (w in sw until sticker[0].size) {
//            if (noteBook[h][w] == 1) return false
//        }
//    }
//    return true
//}

fun attach(sticker: Array<IntArray>, sh: Int, sw: Int): Int {
    for (h in 0 until sticker.size) {
        for (w in 0 until sticker[0].size) {
            if (sticker[h][w] == 1)
                noteBook[h+sh][w+sw] = 1
        }
    }
    return noteBook[sh].reversed().indexOfFirst { it==1 }
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
    rotatedSticker.forEach { println(it.contentToString()) }
    return rotatedSticker
}