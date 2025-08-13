import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> graph;
    public static boolean[] visited;

    public static void dfs(int x) {
        visited[x] = true;
        for (int y : graph.get(x)) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }

    public static void addEdge(int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>(n+1);
        visited = new boolean[n+1];

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<m; i++) {
            StringTokenizer uv = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(uv.nextToken());
            int v = Integer.parseInt(uv.nextToken());
            addEdge(u, v);
        }

        int result = 0;
        for (int i=1; i<=n; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }
}
