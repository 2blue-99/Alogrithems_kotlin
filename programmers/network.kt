class network {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var graph = Array(n+1){mutableListOf<Int>()}
        var visit = BooleanArray(n+1)
        var result = mutableListOf<Int>()
        var cnt = 1
        var min = n


        fun dfs(node: Int){
            cnt++
            for(nextNode in graph[node]){
                if(visit[nextNode]) continue
                visit[nextNode] = true
                dfs(nextNode)
            }
        }


        for(i in wires.indices){
            val nWires = wires.toMutableList()
            graph = Array(n+1){mutableListOf<Int>()}
            visit = BooleanArray(n+1)
            result = mutableListOf<Int>()
            val a = nWires[i]
            nWires.removeAt(i)
            nWires.add(intArrayOf(a[0], a[0]))
            nWires.add(intArrayOf(a[1], a[1]))

            for(k in nWires){
                val from = k[0]
                val to = k[1]
                graph[to].add(from)
                graph[from].add(to)
            }

            for((index, wire) in nWires.withIndex()){
                if(!visit[wire.first()]){
                    visit[wire.first()] = true
                    cnt = 0
                    dfs(wire.first())
                    result.add(cnt)
                }
            }
            val diff = kotlin.math.abs(result[1]-result[0])
            if(diff < min) min = diff
        }
        return min
    }
}