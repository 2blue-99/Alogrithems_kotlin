package com.example.alogrithems.backjune

/**
 * 2023-11-19
 * pureum
 */

//13195193800
//1409528600 mutableset
//1566181500
//21147823800
//791424700
//1445634600
//850039400
//1997037300 hashset
//1201959100
//809115600
//489372500
//633680000
//8384526500
//1388368000

//mutableSet
//1.65260116E8
//1.65962506E8
//1.630359E8
//1.61698924E8
//1.6216686E8
//1.62909118E8
//1.63392224E8

//HashSet
//1.7571026E8
//1.6811315E8
//1.66321096E8
//1.65855382E8
//1.69647574E8
//1.65531804E8

//fun main(){
//    val list = mutableListOf<Long>()
//    for(i in 1..50) {
//        var startTime = System.nanoTime()
//        var set = mutableSetOf<String>()
//        var input = "sdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkadsdafjfjdasklfjsdfasjdfkldjklfjlsjdfkljsakljkasjdkjfasjfjdsfjljsdalfjklsjkfjlasdjfljldkjajsflsdjldsajflkad"
//        for (i in 0..input.length) { // 0 1 2 3 4
//            for (k in i + 1..input.length) { // 0 until input.size 0 1 2 3 4 5
//                set.add(input.substring(i, k))
//            }
//        }
//        var endTime = System.nanoTime()
//        list.add(endTime - startTime)
//    }
//    println(list.average())
//}


// 2135820400
// set을 사용했으나 실패


//3.40375E8 -> 0.3초
//2.3594437E9 -> 2초
fun main() {
    val timeList = mutableListOf<Long>()
    var set = mutableSetOf<String>()
    var inputList = readln()
    var startTime = System.nanoTime()
    repeat(50) {
        for (i in 0..inputList.length) { // 0 1 2 3 4
            for (k in i + 1..inputList.length) { // 0 until input.size 0 1 2 3 4 5
                set.add(inputList.substring(i, k))
            }
        }
    }
    var endTime = System.nanoTime()

    timeList.add(endTime-startTime)

    println(timeList.average())
//    println(set.size)
}


// 2.388224E9
//2.3594437E9
//2.4179414E9
//fun main() {
//    val timeList = mutableListOf<Long>()
//    var set = mutableSetOf<List<String>>()
//    var inputList = readln().chunked(1)
//    var startTime = System.nanoTime()
//    repeat(50) {
//        for (i in 0..inputList.size) { // 0 1 2 3 4
//            for (k in i + 1..inputList.size) { // 0 until input.size 0 1 2 3 4 5
//                set.add(inputList.slice(i..k - 1))
//            }
//        }
//    }
//    var endTime = System.nanoTime()
//    timeList.add(endTime-startTime)
//
//
//    println(timeList.average())
////    println(set.size)
//}