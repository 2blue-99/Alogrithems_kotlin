package com.example.alogrithems

fun main(){
    val repeat = readLine()?.toInt()
    val dap : ArrayList<Int> = arrayListOf()
    for(i in 1..repeat!!){
        val pu = readLine()?.split(" ")
        val one = pu?.get(0)?.toInt()
        val two = pu?.get(1)?.toInt()
        dap.add(nCr(two!!, one!!))
    }
    dap.forEach {
        print(it)
        if(dap.indexOf(it) != dap.size) {
            print("\n")
            println(dap.indexOf(it))
            println(dap.size)
        }
    }
}

fun fac(num : Int) : Double{
    var result = 1.0
    for(i in 1..num){
        result *= i
    }
    return result
}

fun facM(num : Int, numM : Int) : Double{
    var result = 1.0
    for(i in numM+1..num){
        result *= i
    }
    return result
}

fun nCr(n: Int, r: Int): Int {
    if(n == r)
        return 1
    return (facM(n, n-r) / fac(r)).toInt()
}