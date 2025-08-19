package stack;

import java.util.Scanner;

public class Stackst {
    int top;
    int capacity;
    int[] stk;

    // Default constructor
    Stackst() {
        capacity = 5;
        stk = new int[capacity];
        top = -1; // Important: initialize top properly
        for (int i = 0; i < capacity; i++) {
            stk[i] = 0;
        }
    }

    // Parameterized constructor
    Stackst(int cap) {
        capacity = cap;
        top = -1;
        stk = new int[cap];
    }

    // Push operation
    public void pushItem(int val) {
        if (top == capacity - 1) {
            System.out.println("STACK OVERFLOW");
        } else {
            top++;
            stk[top] = val;
        }
    }

    // Pop operation
    public int popItem() {
        if (top == -1) {
//            System.out.println("STACK UNDERFLOW");
            return -9999;
        } else {
            int val = stk[top];
            top--;
            return val; // return the popped element
        }
    }

    // Print the stack
    public void printStack() {
        if (top == -1) {
            System.out.println("STACK UNDERFLOW");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
        Stackst obj1 = new Stackst(5);

        // Push elements
        for (int i = 0; i < obj1.capacity; i++) {
            System.out.print("Enter an element: ");
            value = scanner.nextInt();
            obj1.pushItem(value);
        }

        // Print stack
        obj1.printStack();

        // Pop elements
        for (int i = 0; i < obj1.capacity; i++) {
            int ans = obj1.popItem();
            if (ans != -9999)
                System.out.println("Popped: " + ans);
        }

        // Try printing again (should say underflow)
        obj1.printStack();
    }
}
