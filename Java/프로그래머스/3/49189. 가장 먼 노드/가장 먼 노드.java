import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n+1);
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] distance = new int[n+1];
        
        for(int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        distance[1] = 1;
        q.add(1);
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int node : graph.get(cur)){
                if(distance[node] == 0) {
                    distance[node] = distance[cur] + 1;
                    q.add(node);
                }
            }
        }
        
        int max = Arrays.stream(distance).max().getAsInt();
        
        int answer = (int)Arrays.stream(distance).filter(d->d==max).count();
        return answer;
    }
}