package com.blue.algorithem_kotlin.programmers

import com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune.empty
import java.util.*
import kotlin.math.*

fun main(){
    val gap = Puzzle().solution(arrayOf(
        intArrayOf(1, 1, 0, 0, 1, 0),
        intArrayOf(0, 0, 1, 0, 1, 0),
        intArrayOf(0, 1, 1, 0, 0, 1),
        intArrayOf(1, 1, 0, 1, 1, 1),
        intArrayOf(1, 0, 0, 0, 1, 0),
        intArrayOf(0, 1, 1, 1, 0, 0)
    ), arrayOf(
        intArrayOf(1, 0, 0, 1, 1, 0),
        intArrayOf(1, 0, 1, 0, 1, 0),
        intArrayOf(0, 1, 1, 0, 1, 1),
        intArrayOf(0, 0, 1, 0, 0, 0),
        intArrayOf(1, 1, 0, 1, 1, 0),
        intArrayOf(0, 1, 0, 0, 0, 0)
    ))

    println(gap)
}

class Puzzle() {
    fun solution(game_board: Array<IntArray>, table: Array<IntArray>): Int {
        var answer: Int = 0
        val size = table.size
        val queue: Queue<Pair<Int,Int>> = LinkedList()
        val blockList = mutableListOf<Array<IntArray>>()
        val emptyList =  mutableListOf<Array<IntArray>>()
        val tableVisit = Array(table.size){BooleanArray(table[0].size)}
        val boardVisit = Array(game_board.size){BooleanArray(game_board[0].size)}

        // 스티커를 찾아서 스티커 배열에 넣기
        fun extractBfs(arr: Array<IntArray>, visit: Array<BooleanArray>, target: Int): Array<IntArray>{
            val rList = listOf(0,0,1,-1)
            val cList = listOf(1,-1,0,0)
            // 추출
            val extract = mutableListOf<Pair<Int,Int>>()
            while(queue.isNotEmpty()){
                // 2,1  2,2  1,2  2,3
                val poll = queue.poll()!!
                extract.add(poll)
                var (r,c) = poll
                visit[r][c] = true
                for(i in 0 until 4){
                    val nr = r + rList[i]
                    val nc = c + cList[i]
                    if(nr < 0 || nc < 0 || nr >= size || nc >= size || visit[nr][nc] || arr[nr][nc] != target) continue
                    queue.add(Pair(nr,nc))
                }
            }
            val maxR = extract.map{it.first}.maxOf{it}
            val minR = extract.map{it.first}.minOf{it}

            val maxC = extract.map{it.second}.maxOf{it}
            val minC = extract.map{it.second}.minOf{it}

            val resultArr = Array(maxR-minR+1){IntArray(maxC-minC+1)}


            extract.forEach{
                var(r,c) = it
                r-=minR
                c-= minC
                resultArr[r][c] = 1
            }
            return resultArr
        }

        for(r in table.indices){
            for(c in table.indices){
                if(table[r][c] == 1 && !tableVisit[r][c]){
                    queue.add(Pair(r,c))
                    blockList.add(extractBfs(table, tableVisit, 1))
                }
                if(game_board[r][c] == 0 && !boardVisit[r][c]){
                    queue.add(Pair(r,c))
                    emptyList.add(extractBfs(game_board, boardVisit, 0))
                }
            }
        }

        blockList.forEach { it.forEach { println(it.contentToString())} }
        println()
        emptyList.forEach { it.forEach { println(it.contentToString())} }

        fun rotation(block: Array<IntArray>): Array<IntArray> {
            val maxSize = max(block.size, block[0].size)
            val rectangle = Array(maxSize){IntArray(maxSize)}
            val rotation = Array(maxSize){IntArray(maxSize)}
            val result = Array(block[0].size){IntArray(block.size)}

            for(r in block.indices){
                for(c in block[0].indices){
                    if(block[r][c] == 1)
                        rectangle[r][c] = 1
                }
            }

            for(r in rotation.indices){
                for(c in rotation[0].indices){
                    rotation[c][maxSize-1-r] = rectangle[r][c]
                }
            }

            var minR = 0
            var minC = 0

            for((index, i) in rotation.withIndex()){
                if(i.contains(1))
                    break
                minR = index
            }

            loop@for(r in rotation.indices){
                for(c in rotation.indices){
                    if(rotation[c][r] == 1)
                        break@loop
                }
                minC = r+1
            }

            for(r in rotation.indices) {
                for (c in rotation[0].indices) {
                    if (rotation[r][c] == 1)
                        result[r-minR][c-minC] = 1
                }
            }

            return result
        }

        for(empty in emptyList){
            loopBlock@for(index in blockList.indices){
                var newBlock = blockList[index].copyOf()
                for(rotation in 0..3){
                    var ok = true
                    // 사이즈 비교

                    if(empty.size == newBlock.size && empty[0].size == newBlock[0].size) {
                        for (r in empty.indices) {
                            if (!empty[r].contentEquals(newBlock[r])) {
                                ok = false
                                break
                            }
                        }
                    }else{
                        ok = false
                    }

                    if(ok){
                        newBlock.forEach {
                            answer+=it.count { it==1 }
                        }
                        blockList.removeAt(index)
                        break@loopBlock
                    }
                    newBlock = rotation(newBlock)
                }
            }
        }
        return answer
    }
}