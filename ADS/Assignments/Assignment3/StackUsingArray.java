package DoublyLinkedList;

import java.util.Scanner;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int maxSize;

    public StackUsingArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        StackUsingArray stack = new StackUsingArray(size);

        while (true) {
            String str = sc.next();

            if (str.equalsIgnoreCase("push")) {
                int value = sc.nextInt();
                stack.push(value);
            } else if (str.equalsIgnoreCase("pop")) {
                stack.pop();
            } else if (str.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
