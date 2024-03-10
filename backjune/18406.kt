fun main() {
	val n = readln().toList().map{it.toInt()}
    if(n.slice(0..(n.size/2 -1)).sum() == n.slice(n.size/2..n.size-1).sum())
    	println("LUCKY")
    else
    	println("READY")
}
