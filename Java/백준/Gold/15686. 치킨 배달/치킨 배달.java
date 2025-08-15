import java.io.*;
import java.util.*;

class Main {
    public static ArrayList<Point> homeList = new ArrayList<>();
    public static ArrayList<Point> chickenList = new ArrayList<>();
    public static boolean[] visited;
    public static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int x=0; x<N; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y=0; y<N; y++) {
                int type = Integer.parseInt(st.nextToken());

                if (type==1) {
                    homeList.add(new Point(x,y));
                } else if (type==2) {
                    chickenList.add(new Point(x,y));
                }
            }
        }

        visited = new boolean[chickenList.size()];
        combination(0, 0, chickenList.size(), M);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
        br.close();

    }

    public static void combination(int start, int depth, int n, int r) {
        if (depth == r) {
            int result = 0;
            for (int i=0; i<homeList.size(); i++) {
                Point home = homeList.get(i);
                int temp = Integer.MAX_VALUE;
                for (int j=0; j<chickenList.size(); j++) {
                    if (visited[j]) {
                        Point chicken = chickenList.get(j);
                        int dist = Math.abs(home.getX() - chicken.getX()) + Math.abs(home.getY() - chicken.getY());
                        temp = Math.min(temp, dist);
                    }
                }
                result += temp;
            }
            answer = Math.min(result, answer);
            return;
        }
        for (int i=start; i<n; i++) {
            visited[i] = true;
            combination(i+1, depth+1, n, r);
            visited[i] = false;
        }

    }
}

class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x; 
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}