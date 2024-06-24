package com.blue.algorithem_kotlin.programmers

fun main() {
//    val gap = Donut().solution(arrayOf(intArrayOf(2,3), intArrayOf(4,3), intArrayOf(1,1), intArrayOf(2,1)))
//    val gap = Donut().solution(arrayOf(intArrayOf(2,3), intArrayOf(4,3), intArrayOf(1,5), intArrayOf(5,6), intArrayOf(6,5), intArrayOf(5,1), intArrayOf(2,1)))
    val gap2 = Donut().solution(
        arrayOf(
            intArrayOf(4, 11),
            intArrayOf(1, 12),
            intArrayOf(8, 3),
            intArrayOf(12, 7),
            intArrayOf(4, 2),
            intArrayOf(7, 11),
            intArrayOf(4, 8),
            intArrayOf(9, 6),
            intArrayOf(10, 11),
            intArrayOf(6, 10),
            intArrayOf(3, 5),
            intArrayOf(11, 1),
            intArrayOf(5, 3),
            intArrayOf(11, 9),
            intArrayOf(3, 8)
        )
    )
    println(gap2.contentToString())
}

class Donut {
    fun solution(edges: Array<IntArray>): IntArray {
        // 새 정점 구하기
        // 향하는 인접리스트
        // Boolean 인덱스 배열
        // 향하는 인접리스트에 두개이상있고, Boolean 인덱스 배열이 false일 경우 새정점

        // 향하는 인접리스트 비었음 -> 막대
        // 향하는 인접리스트 2개 이상 -> 8자
        // 정점 인접리스트 개수 - 막대 - 8자
        var answer: IntArray = IntArray(4)
        var max = edges.flatMap{it.toList()}.maxOf{it}
        // 들어오는거, 나가는거
        val giveArr = Array(max+1){it -> arrayOf(0,0)}

        edges.forEach{
            val (from, to) = it
            giveArr[from][1] += 1
            giveArr[to][0] += 1
        }

        for((index, pair) in giveArr.withIndex()){
            if(index==0) continue
            //정점
            if(pair[0] == 0 && pair[1] >= 2)
                answer[0] = index
            //막대
            else if(pair[0] >= 1 && pair[1] == 0)
                answer[2] += 1
            //8자
            else if(pair[0] >= 2 && pair[1] >= 2)
                answer[3] += 1
        }

        answer[1] = giveArr[answer[0]][1] - answer[2] - answer[3]


        return answer
    }
}

//class Donut {
//    fun solution(edges: Array<IntArray>): IntArray {
//        // 정점 : 들어오는거 0, 나가는거 2 이상
//        // 도넛 : 정점 간선 개수 - 막대 - 8자
//        // 막대 : 들어오는거 1, 나가는거 0
//        // 8자  : 들어오는거 2 이상, 나가는거 2 이상
//        var answer = IntArray(4)
//        val maxNode = edges.flatMap { it.toList() }.maxOf { it }
//        // 들어오는거 나가는거
//        var arr = Array(maxNode+1){i -> arrayOf(0,0) }
//
//        edges.forEach {
//            // 2 , 3
//            val (from, to) = it
//            arr[from][1] += 1
//            arr[to][0] += 1
//        }
//
//        arr.forEachIndexed { index, i ->
//            val (get, give) = i
//            // 정점
//            if(get == 0 && give >= 2) answer[0] = index
//            // 막대
//            else if(get >= 1 && give == 0 ) answer[2] += 1
//            // 8자
//            else if(get >= 2 && give >= 2) answer[3] += 1
//        }
//
//        answer[1] = arr[answer[0]][1] - answer[2] - answer[3]
//
//        return answer
//    }
//}

//class Donut {
//    fun solution(edges: Array<IntArray>): IntArray {
//        var answer = IntArray(4)
//        val max = edges.flatMap { it.toList() }.maxOf { it }
//        var giveArr = Array(max + 1) { mutableListOf<Int>() }
//        var getArr = Array(max + 1) { mutableListOf<Int>() }
//        var answerList = mutableSetOf<MutableList<Int>>()
//        edges.forEach {
//            val (from, to) = it
//            giveArr[from].add(to)
//            getArr[to].add(from)
//        }
//
////        giveArr.forEach{println(it)}
////        println()
////        getArr.forEach{println(it)}
//
//        // 정점 찾기
//        for (i in giveArr.indices) {
//            if (giveArr[i].isNotEmpty() && getArr[i].isEmpty()) {
//                answer[0] = i
//                break
//            }
//        }
//
//
//        var copyArr = Array(max + 1){ i -> giveArr[i].toMutableList()}
//
//        fun dfs(n: Int){
//            for((index, i) in copyArr[n].withIndex()){
//                if(i == 0) continue
//                copyArr[n][index] = 0
//                answerList.add(giveArr[i])
//                dfs(i)
//            }
//        }
//
//        dfs(answer[0])
//
//        for(list in answerList){
//            if(list.size == 2){
//                answer[3] += 1
//            }else if(list.isEmpty()){
//                answer[2] += 1
//            }
//        }
//
//        println(answerList)
//        giveArr.forEach{println(it)}
//        println(answerList)
//
//        answer[1] = giveArr[answer[0]].size - answer[2] - answer[3]
//
//        return answer
//    }
//}

//class Donut {
//    fun solution(edges: Array<IntArray>): IntArray {
//        // 막대 : 돌아오는게 없음
//        // 8자 : 방문한곳을 2번 이상 방문
//        // 도넛 : 방문한곳을 한번 방문
//        var answer: IntArray = IntArray(4)
//        val max = edges.flatMap { it.toList() }.maxOf { it }
//        var giveArr = Array(max + 1) { mutableListOf<Int>() }
//        var getArr = Array(max + 1) { mutableListOf<Int>() }
//        edges.forEach {
//            val (from, to) = it
//            giveArr[from].add(to)
//            getArr[to].add(from)
//        }
//
////        giveArr.forEach{println(it)}
////        println()
////        getArr.forEach{println(it)}
//
//        // 정점 찾기
//        for (i in giveArr.indices) {
//            if (giveArr[i].isNotEmpty() && getArr[i].isEmpty()) {
//                answer[0] = i
//                break
//            }
//        }
//
//        // 그래프 찾기
//        fun dfs(n: Int, start: Int, cnt: Int, visit: MutableList<Int>) {
//            var visitCnt = cnt
//            if(visit.contains(n)){
//                visitCnt++
//            }
//            visit.add(n)
//            //막대 그래프
//            if (giveArr[n].isEmpty()) {
//                answer[2] += 1
//                return
//            } else if (n == start && giveArr[n].size == giveArr[n].count { it == 0 }) {
//                // 도넛 그래프
//                if(visitCnt == 1) {
//                    answer[1] += 1
//                    return
//                }
//                // 8자 그래프
//                else {
//                    answer[3] += 1
//                    return
//                }
//
//            }
//            for ((index, node) in giveArr[n].withIndex()) {
//                if (node == 0) continue
//                giveArr[n][index] = 0
//                dfs(node, start, visitCnt, visit)
//            }
//        }
//
//        for (node in giveArr[answer[0]]) {
//            dfs(node, node, 0, mutableListOf())
//        }
//
//        return answer
//    }
//}