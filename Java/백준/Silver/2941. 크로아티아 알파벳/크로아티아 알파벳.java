import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        Map<Character, List<String>> dict = Map.of(
            'c', List.of("c=", "c-"),
            'd', List.of("dz=", "d-"),
            'l', List.of("lj"),
            'n', List.of("nj"),
            's', List.of("s="),
            'z', List.of("z=")
        );

        String str = br.readLine();
        int cnt = 0;
        int len = str.length();
        for (int i=0; i<len; i++) {
            StringBuilder sb;
            char cur = str.charAt(i);
            if (dict.keySet().contains(cur) && i < len-1) {
                sb = new StringBuilder();
                sb.append(cur);
                sb.append(str.charAt(i+1));
                if ("dz".equals(sb.toString()) && i < len-2){
                    sb.append(str.charAt(i+2));
                }
                if (dict.get(cur).contains(sb.toString())) {
                    i+=sb.length()-1;
                }
            }
            cnt++;
        }

        bw.write(cnt+"\n");
        bw.flush();

        br.close();
        bw.close();
    }
}