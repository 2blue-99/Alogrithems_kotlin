package com.blue.algorithem_kotlin.backjune


fun main() {
    val n = readln().toInt()
    val k = readln().toInt()
    val arr = IntArray(n)
    val vArr = BooleanArray(n)
    val result = mutableSetOf<Int>()
    repeat(n) {
        arr[it] = readln().toInt()
    }
    fun dfs(cnt: Int, num: String) {
        if (cnt == k) {
            result.add(num.toInt())
            return
        }
        for (i in 0 until n) {
            if(vArr[i]) continue
            vArr[i] = true
            dfs(cnt+1, num+arr[i])
            vArr[i] = false
        }
    }
    dfs(0,"")
    println(result.size)
}

//fun main() {
//    val n = readln().toInt()
//    val k = readln().toInt()
//    val arr = IntArray(n)
//    val vArr = BooleanArray(n)
//    val numList = mutableListOf<List<Int>>()
//    val result = mutableListOf<Int>()
//    repeat(n) {
//        arr[it] = readln().toInt()
//    }
//    fun dfs(cnt: Int) {
//        if (cnt == k) {
//            println(vArr.contentToString())
//            val list = vArr.indices
//                .filter { vArr[it] }
//                .map { arr[it] }
//            numList.add(list)
//            return
//        }
//        for (i in cnt until n) {
//            if (vArr[i]) continue
//            vArr[i] = true
//            dfs(cnt + 1)
//            vArr[i] = false
//        }
//    }
//    dfs(0)
//
//    result
//
//
//}