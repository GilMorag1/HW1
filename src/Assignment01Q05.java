public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j){return 0;}
        int n = m.length;
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        int[] queue = new int[n];
        int first = 0;
        int last = 0;
        queue[last] = i;
        last++;
        visited[i] = true;
        dist[i]=0;
        while(first<last){
            int u = queue[first];
            first++;
            visited[u] = true;
            for (int v =0; v<n; v++){
                if (m[u][v] == 1 && !visited[v]){
                    visited[v] = true;
                    dist[v] = dist[u]+1;
                    if (v==j){
                        return dist[v];
                    }
                    queue[last] = v;
                    last++;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}