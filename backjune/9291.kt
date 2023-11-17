package com.example.alogrithems.backjune

    /**
 * 2023-05-09
 * pureum
 */


fun main(){
    var gap = readln().toInt()
    var result = ""
    val arr = Array(9){IntArray(9){0}}

    for(z in 1..gap){
        result=""
        if(z!=1) readln()

        for(f in 0..8){
            arr[f] = readln().split(" ").map { it.toInt() }.toIntArray()
        }

        for ((i,gap) in arr.withIndex()) {
            if (gap.toSet().size != 9) {
                result = "INCORRECT"
                break
            }
        }
        if (result == "INCORRECT") {
            println("Case $z: INCORRECT")
            continue
        }

        for (i in 0..8) {
            val list = mutableListOf<Int>()
            for (k in 0..8) {
                list.add(arr[k][i])
            }
            if (list.toSet().size != 9) {
                result = "INCORRECT"
                break
            }
        }

        if (result == "INCORRECT") {
            println("Case $z: INCORRECT")
            continue
        }

        var count = 0
        for (i in 0..2) {
            var list = mutableListOf<Int>()
            for (k in 0..8) {
                arr[k].slice(count..count + 2).forEach { list.add(it) }
                if (list.size == 9)
                    if (list.toSet().size != 9) {
                        result = "INCORRECT"
                        break
                    } else list.clear()
            }
            if (result == "INCORRECT") break
            count += 3
        }

        if (result == "INCORRECT") {
            println("Case $z: INCORRECT")
            continue
        }
        println("Case $z: CORRECT")
    }
}
