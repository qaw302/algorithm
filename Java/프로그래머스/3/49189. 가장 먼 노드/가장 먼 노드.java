import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        int[] dist = new int[n+1];
        for (int i=1; i<=n; i++) {
            graph.put(i, new HashSet<>());
        }
        for(int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        
        dist[1] = 1;
        q.add(1);
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int node : graph.get(cur)) {
                if (dist[node] == 0) {
                    dist[node] = dist[cur]+1;
                    q.add(node);
                }
            }
        }
        System.out.println(Arrays.toString(dist));
        int max = 0;
        for (int d : dist) {
            max = Math.max(max, d);
        }
        
        int answer = 0;
        for (int d : dist) {
            if (d == max) {
                answer ++;
            }
        }
        return answer;
    }
}