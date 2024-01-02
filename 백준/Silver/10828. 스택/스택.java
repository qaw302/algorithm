import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Stack10828
 */
public class Main {
    private int[] stack;
    int cursor = -1;

    public Main(int capacity) {
        stack = new int[capacity];
    }

    public void push(int num) {
        if (cursor < stack.length - 1) {
            stack[++cursor] = num;
        } else {
            // System.out.println("stack is pull");
        }
    }

    public int pop() {
        int result = -1;
        if (empty() == 1) {
            // System.out.println("Stack is empty");
        } else {
            result = stack[cursor];
            stack[cursor--] = 0;
        }
        return result;
    }

    public int size() {
        return cursor + 1;
    }

    public int empty() {
        return cursor < 0 ? 1 : 0;
    }

    public int top() {
        return empty() == 1 ? -1 : stack[cursor];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main stack = new Main(10000);
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
                default:
                    break;
            }
        }
    }

}