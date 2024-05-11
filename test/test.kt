package com.blue.algorithem_kotlin.test

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*


fun main(): Unit = runBlocking {
    var map = mutableMapOf<Pair<Int, Int>, ArrayList<Pair<Int, Int>>>()
    var map2 = mutableMapOf<Pair<Int, Int>, Boolean>()

    println(map[Pair(1,1)])

    println(map.getOrPut(Pair(1,1)){ arrayListOf(Pair(1,1)) })

    println(map[Pair(1,1)])

    map.getOrPut(Pair(1,1)){ arrayListOf(Pair(5,5)) }

    println(map[Pair(1,1)])


}
