package com.blue.algorithem_kotlin.backjune

fun main() {
    val (n,c) = readln().split(" ").map{it.toInt()}

    val cntMap = mutableMapOf<Int,Int>()
    val indexMap = mutableMapOf<Int,Int>()

    var num = readln().split(" ").map{it.toInt()}
    repeat(n){ cnt->
        cntMap[num[cnt]] = cntMap.getOrDefault(num[cnt], 0) + 1
        if(!indexMap.contains(num[cnt]))
            indexMap[num[cnt]] = indexMap.getOrDefault(num[cnt],cnt)
    }
    cntMap.toList()
        .sortedWith(compareByDescending<Pair<Int, Int>>{it.second}.thenBy {indexMap[it.first]})
        .toMap()
        .forEach{
            repeat(it.value){ i ->
                print("${it.key} ")
            }
        }
}