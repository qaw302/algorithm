import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10001];

        for (int i=1; i<arr.length; i++) {
            int num = i;
            int sum = i;
            while (num != 0) {
                sum += num%10;
                num = num/10;
            }
            if (sum > 10000) {
                continue;
            }
            arr[sum]++;
        }

        for(int i=1; i<arr.length; i++) {
            if (arr[i]==0) {
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
    }
}