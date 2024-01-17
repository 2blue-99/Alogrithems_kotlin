package com.example.alogrithems.AlgorithemKotlin.app.src.main.java.com.blue.algorithem_kotlin.backjune

fun main(){
    val num = readln().toInt()
    val arr = Array(num){ Array(num){""} }
    repeat(num){h ->
        readln().chunked(1).forEachIndexed { w, s ->
            arr[h][w] = s
        }
    }

    val queue = ArrayDeque<List<Int>>()
    var vArr = Array(num){Array(num){false}}
    var cArr = Array(arr.size) { arr[it].copyOf() }
    var check = false
    queue.addLast(listOf(0,0))

    fun bfs(alpha: String){
        while(queue.isNotEmpty()){
            val (h,w) = queue.removeFirst()
            if(h<0 || w<0 || h>=num || w>=num) continue
            if(check && alpha != "B"){
                if(cArr[h][w]=="B") continue
            }else{
                if(cArr[h][w]!=alpha) continue
            }
            if(vArr[h][w]) continue

            vArr[h][w] = true
            cArr[h][w] = " "

            queue.addLast(listOf(h+1,w))
            queue.addLast(listOf(h-1,w))
            queue.addLast(listOf(h,w+1))
            queue.addLast(listOf(h,w-1))
        }
    }

    repeat(2) {
        cArr = Array(arr.size) { arr[it].copyOf() }
        vArr = Array(num){Array(num){false}}
        val map = mutableMapOf("R" to 0, "G" to 0, "B" to 0)

        for (h in 0 until num) {
            for (w in 0 until num) {
                when (cArr[h][w]) {
                    "R" -> {
                        queue.addLast(listOf(h, w))
                        map["R"] = map["R"]!!.plus(1)
                        bfs("R")
                    }

                    "G" -> {
                        queue.addLast(listOf(h, w))
                        if(check) map["R"] = map["R"]!!.plus(1)
                        else map["G"] = map["G"]!!.plus(1)
                        bfs("G")
                    }

                    "B" -> {
                        queue.addLast(listOf(h, w))
                        map["B"] = map["B"]!!.plus(1)
                        bfs("B")
                    }
                }
            }
        }
        check = true
        print("${map.values.sum()} ")
    }
}
