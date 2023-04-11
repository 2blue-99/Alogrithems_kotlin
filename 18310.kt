import kotlin.math.abs

fun main(){
    var num = readln().toInt()
    var myList = readln().split(" ").map { it.toInt() }.sorted()
    var indexMid = myList.size/2
    if(num % 2 != 0){
        println(myList[indexMid])
    }else{
        var hapA = 0
        var hapB = 0
        for(k in myList){
            hapA += abs(myList[myList.size/2-1] - k)
            hapB += abs(myList[myList.size/2] - k)
        }
        if(hapA<=hapB){
            println(myList[myList.size/2-1])
        }else if(hapA>hapB){
            println(myList[myList.size/2])
        }else{
            println(if(myList[myList.size/2-1] < myList[myList.size/2]) myList[myList.size/2-1] else myList[myList.size/2])
        }
    }
}