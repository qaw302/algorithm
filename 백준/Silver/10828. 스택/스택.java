import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  private int[] elements;
  private int top = -1;

  public Main() {
    elements = new int[16];
  }

  public Main(int size) {
    elements = new int[size];
  }

  public void push(int n) {
    elements[++top] = n;
  }

  public int pop() {
    if (top == -1) {
      return -1;
    }
    int result = elements[top];
    elements[top--] = 0;
    return result;
  }

  public int size() {
    return top + 1;
  }

  public int empty() {
    return top == -1 ? 1 : 0;
  }

  public int top() {
    if (top == -1) {
      return -1;
    }
    return elements[top];
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    Main stack10828 = new Main(count);
    for (int i = 0; i < count; i++) {
      String command = br.readLine();
      String method = command.split(" ")[0];

      if ("push".equals(method)) {
        stack10828.push(Integer.parseInt(command.split(" ")[1]));
      } else if ("pop".equals(method)) {
        System.out.println(stack10828.pop());
      } else if ("size".equals(method)) {
        System.out.println(stack10828.size());
      } else if ("empty".equals(method)) {
        System.out.println(stack10828.empty());
      } else if ("top".equals(method)) {
        System.out.println(stack10828.top());
      } else {
        System.out.println("error");
      }
    }
  }
}