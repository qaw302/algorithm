import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack(n);
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();

            switch (commend) {
                case "push": stack.push(Integer.parseInt(st.nextToken())); break;
                case "pop" : stack.pop(); break;
                case "size" : stack.size(); break;
                case "empty" : stack.empty(); break;
                case "top" : stack.top(); break;
            }
        }
    }
}

class Stack {
    private final int[] stack;
    private int size=0;

    public Stack(int capacity) {
        stack = new int[capacity];
    }
    
    public void push(int n) {
        stack[size++] = n;
    }

    public void pop() {
        int n;
        if (size > 0) {
            n = stack[--size];
            stack[size] = 0;
        } else {
            n = -1;
        }
        System.out.println(n);
    }

    public void size() {
        System.out.println(size);
    }
    
    public void empty() {
        if (size == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void top() {
        int n;
        if (size == 0) {
            n=-1;
        } else {
            n=stack[size-1];
        }
        System.out.println(n);
    }
}