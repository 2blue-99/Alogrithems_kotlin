fun main() {
	val n = readln().toInt()
    repeat(n){
        print(" ".repeat(it))
        println("*".repeat(n-it))
    }
}
