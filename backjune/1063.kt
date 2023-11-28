package com.example.alogrithems.backjune

/**
 * 2023-11-28
 * pureum
 */

fun main(){
    // 8 X 8 배열을 만들고 왕의 위치와 돌의 위치를 입력
    // 킹 조종 + 바둑알 위치일땐 바둑알도 같이 움직이기
    // 만약 움직임을 통해 킹이나 돌이 체스판 밖으로 나갈 경우 그 이동 무시

//    C1 B1 3
//    L
//    T
//    LB

    val (king, stone, num) = readln().split(" ")

    // 킹 = 2, 돌 = 1, 나머지 0
    val kl = getLocation(king).toMutableList()
    val sl = getLocation(stone).toMutableList()

    for(i in 0 until num.toInt()){
        when(readln()){
            "R" -> {
                if(checkOne(kl[0]+1)) continue
                if(mutableListOf(kl[0]+1, kl[1]) == sl) {
                    if(checkOne(sl[0]+1)) continue
                    sl[0]++
                }
                kl[0]++
            }
            "L" -> {
                if(checkOne(kl[0]-1)) continue
                if(mutableListOf(kl[0]-1, kl[1]) == sl) {
                    if(checkOne(sl[0]-1)) continue
                    sl[0]--
                }
                kl[0]--
            }
            "B" -> {
                if(checkOne(kl[1]-1)) continue
                if(mutableListOf(kl[0], kl[1]-1) == sl) {
                    if(checkOne(sl[1]-1)) continue
                    sl[1]--
                }
                kl[1]--
            }
            "T" -> {
                if(checkOne(kl[1]+1)) continue
                if(mutableListOf(kl[0], kl[1]+1) == sl) {
                    if(checkOne(sl[1]+1)) continue
                    sl[1]++
                }
                kl[1]++
            }
            "RT" -> {
                if(checkTwo(kl[0]+1, kl[1]+1)) continue
                if(mutableListOf(kl[0]+1, kl[1]+1) == sl) {
                    if(checkTwo(sl[0]+1, sl[1]+1)) continue
                    sl[0]++
                    sl[1]++
                }
                kl[0]++
                kl[1]++
            }
            "LT" -> {
                if(checkTwo(kl[0]-1,kl[1]+1)) continue
                if(mutableListOf(kl[0]-1, kl[1]+1) == sl) {
                    if(checkTwo(sl[0]-1, sl[1]+1)) continue
                    sl[0]--
                    sl[1]++
                }
                kl[0]--
                kl[1]++
            }
            "RB" -> {
                if(checkTwo(kl[0]+1, kl[1]-1)) continue
                if(mutableListOf(kl[0]+1, kl[1]-1) == sl) {
                    if(checkTwo(sl[0]+1, sl[1]-1)) continue
                    sl[0]++
                    sl[1]--
                }
                kl[0]++
                kl[1]--
            }
            "LB" -> {
                if(checkTwo(kl[0]-1, kl[1]-1)) continue
                if(mutableListOf(kl[0]-1, kl[1]-1) == sl) {
                    if(checkTwo(sl[0]-1, sl[1]-1)) continue
                    sl[0]--
                    sl[1]--
                }
                kl[0]--
                kl[1]--
            }
        }
    }
    println(getResult(kl))
    println(getResult(sl))
}

fun checkOne(location: Int): Boolean = (location < 0 || location > 7)
fun checkTwo(locationX: Int, locationY: Int): Boolean = (locationX < 0 || locationX > 7 || locationY < 0 || locationY > 7)

fun getLocation(king: String): List<Int>{
    var x = 0
    var y = 0
    for(i in king){
        when(i){
            'A' -> x = 0
            'B' -> x = 1
            'C' -> x = 2
            'D' -> x = 3
            'E' -> x = 4
            'F' -> x = 5
            'G' -> x = 6
            'H' -> x = 7
            '1' -> y = 0
            '2' -> y = 1
            '3' -> y = 2
            '4' -> y = 3
            '5' -> y = 4
            '6' -> y = 5
            '7' -> y = 6
            '8' -> y = 7
        }
    }
    return listOf(x,y)
}

fun getResult(list: MutableList<Int>): String {
    var x = ""
    when(list.first()){
        0 -> x = "A"
        1 -> x = "B"
        2 -> x = "C"
        3 -> x = "D"
        4 -> x = "E"
        5 -> x = "F"
        6 -> x = "G"
        7 -> x = "H"
    }
    return "$x${list[1]+1}"
}