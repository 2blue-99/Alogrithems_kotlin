package com.blue.algorithem_kotlin.backjune

lateinit var noteBook: Array<IntArray>
fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    noteBook = Array(m){IntArray(n)}

    repeat(k) {
        val (row, col) = readln().split(" ").map { it.toInt() }
        val max = maxOf(row, col)
        var sticker = Array(max) { IntArray(max) }
        repeat(row) {
            sticker[it] = readln().split(" ").map { it.toInt() }.toIntArray()
        }

        for(h in 0 until m){
            for(w in 0 until n){
                if(noteBook[h][w] == 0)
                    for(i in 0..2){
                        if(checkAndAttach(sticker, h, w))
                            break
                        sticker = rotation(row, col, max, sticker, i)
                    }
            }
        }
    }
}

fun checkAndAttach(sticker: Array<IntArray>, sh: Int, sw: Int): Boolean{
    if(sticker.size-sh > noteBook.size  || sticker.first().size-sw > noteBook.first().size) return false
    val tempNotebook = noteBook.map { it.toMutableList().toIntArray() }.toTypedArray()

    for(h in sticker.indices){
        for(w in sticker.first().indices){
            if(tempNotebook[sh+h][sw+w] == 1) return false
            tempNotebook[sh+h][sw+w] = sticker[h][w]
        }
    }
    noteBook = tempNotebook
    noteBook.forEach { println(it.contentToString()) }
    return true
}

fun rotation(row: Int, col: Int,max: Int, sticker: Array<IntArray>, cnt: Int): Array<IntArray> {
    val realSticker: Array<IntArray>
    val temp = Array(max) { IntArray(max) }

    if(cnt%2==0)
        realSticker = Array(col){IntArray(row)}
    else
        realSticker = Array(row){IntArray(col)}
    for (r in 0 until max) {
        for (c in 0 until max) {
            temp[c][max-1-r] = sticker[r][c]
        }
    }

    return temp
}