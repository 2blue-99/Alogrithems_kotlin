package com.blue.algorithem_kotlin.programmers


import kotlin.math.*

class Solution {
    fun solution(name: String): Int {
        var vertical = 0
        var horizontal = name.length - 1 // 처음부터 오른쪽 끝까지 가는 경우
        var index = 0
        for (i in 0 until name.length) {
            vertical += min(name[i] - 'A', 'Z' - name[i] + 1)

            // 연속되는 A 갯수 확인
            index = i + 1
            while (index < name.length && name[index] == 'A') {
                index++
            }

            horizontal = min(horizontal, i * 2 + name.length - index) // 오른쪽 갔다가 돌아와서 쭉
            horizontal = min(horizontal, (name.length - index) * 2 + i) // 왼쪽 갔다가 돌아와서 쭉
        }

        return vertical + horizontal
    }
}

