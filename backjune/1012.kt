package com.example.alogrithems.backjune

fun main(){

    repeat(readln().toInt()){

        val (mw,mh,k) = readln().split(" ").map { it.toInt() }
        val arr = Array(mh){IntArray(mw){0}}
        val vArr = Array(mh){BooleanArray(mw){false}}
        var count = 0

        repeat(k){
            val (x,y) = readln().split(" ").map { it.toInt() }
            arr[y][x] = 1
        }

        fun dfs(h:Int,w:Int){
            if(h<0 || w<0 || h>=mh || w>=mw) return
            if(vArr[h][w]) return
            if(arr[h][w] == 0) return

            vArr[h][w] = true
            arr[h][w] = 0

            dfs(h+1,w)
            dfs(h-1,w)
            dfs(h,w+1)
            dfs(h,w-1)
        }

        repeat(mh) { h ->
            repeat(mw) { w ->
                if (arr[h][w] == 1) {
                    dfs(h, w)
                    count++
                }
            }
        }
        println(count)
    }
}