package com.example.alogrithems

import com.example.alogrithems.food.Companion.FOOD_STEAK

/**
 * 2022-10-31
 * pureum
 */

fun main(){
    println(FOOD_STEAK)
    food().search(food.FOOD_STEAK)
    food().search(food.FOOD_CREAM_PASTA)
    food().search(food.FOOD_PIZZA)
}

class food {
    fun search(foodName : String){
        val price = when(foodName){
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 13000
            FOOD_PIZZA -> 13000
            else -> 0
        }
        println("$foodName 의 가격은 $price 입니다.")
    }

    companion object{
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "고추파스타"
        const val FOOD_PIZZA = "똥파스타"
    }
}