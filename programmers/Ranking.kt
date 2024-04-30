package com.blue.algorithem_kotlin.programmers

fun main(){
    Ranking().solution(5, arrayOf(intArrayOf(4,3), intArrayOf(4,2), intArrayOf(3,2), intArrayOf(1,2), intArrayOf(2,5)))
}

class Ranking {
    fun solution(n: Int, results: Array<IntArray>): Int {
        var answer = 0
        val arr = Array(n){BooleanArray(n)}

        results.forEach{
            val win = it[0]
            val lose = it[1]
            arr[win-1][lose-1] = true
        }

        repeat(n){ k ->
            repeat(n){ i ->
                repeat(n){ j ->
                    if(!arr[i][j] && arr[i][k] && arr[k][j])
                        arr[i][j] = true
                }
            }
        }

        repeat(n){ i ->
            val row = arr[i].count{it}
            var column = 0
            repeat(n){ k ->
                if(arr[k][i])
                    column+=1
            }
            if(row+column == n-1)
                answer++
        }

        return answer
    }
}