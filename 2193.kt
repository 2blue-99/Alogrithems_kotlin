package com.example.alogrithems

import android.icu.number.IntegerWidth

/**
 * 2023-11-22
 * pureum
 */

// 각 자리의 수마다 조건 부합 되는 것들 배열에 넣기
// N 자리 검사할때 N-1 인덱스의 값에다 0과 1을 붙여서 부합되면 N 인덱스 배열에 넣기

// 1 이상 크고 90 이하의 N값
// 이친수 조건 1 : 맨 왼쪽에 0이 오면 안됨
// 이친수 조건 2 : 11이 반복되면 안됨.

fun main(){
    var gap: String = "helloeoooe"
//    val gap2: String = gap.removeRange(1,2)
    val gap2 = gap
    val gap3: String = gap.removeRange(1,2)


    println(gap)
    println(gap2)
    println(gap3)

    println(System.identityHashCode(gap))
    println(System.identityHashCode(gap2))
    println(System.identityHashCode(gap3))

    println(gap.indexOf('e', 3, true))
    println(gap.indexOfFirst { it == 'e' })

    gap.slice(5 until 6)
    gap.first()

    println(gap.padStart(15,'x'))
    println(gap.padEnd(15,'@'))

    gap.uppercase()
    gap.lowercase()

    println(gap.reversed())

    println(gap)
    println(gap.replaceAfter('o',"%"))
    println(gap.replaceBefore('o',"%"))

    gap.contains('a')
    gap.contains("a")

    println(gap)
    println(gap.chunked(1).toSet().joinToString(""))

    println()
    println(gap.removeSuffix("oooe"))
    println(gap)
    println(gap.toList())
    println(gap.chunked(1))
    gap = "aaqweaabqwebbbccccc"
    println(gap.toSortedSet())
    println(gap)
    println(gap.toList().sorted().joinToString(""))

    println(gap)
    println(gap.toList().sortedBy { it })
    println(gap.take(5))
    println("")
    println(gap.takeWhile { it != 'c' })
    println(gap.substring(2,5))

    println()
    var p = '1'
    println(p.code - '0'.code)
    println(p.code - '0'.code)
    println(p.code - '0'.code)

    val gap6 = "abcdedf"
    println(gap6.reversed())

}
