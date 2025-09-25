import java.util.*;

class MyStack {
    private int[] arr;
    private int top;

    MyStack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top < arr.length - 1) {
            arr[++top] = x;
        }
    }

    int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }
}

public class StackProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();          // number of queries
        MyStack st = new MyStack(100);

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                st.push(x);
            } else if (type == 2) {
                System.out.println(st.pop());
            }
        }
        sc.close();
    }
}
