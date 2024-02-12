package student;
import java.util.EmptyStackException;

public class IntegerStack {
    private int[] stackArray;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public IntegerStack() {
        this(DEFAULT_CAPACITY);
    }

    public IntegerStack(int capacity) {
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    public void push(int element) {
        if (top == stackArray.length - 1) {
            expandCapacity();
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void expandCapacity() {
        int newCapacity = stackArray.length * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stackArray, 0, newStack, 0, stackArray.length);
        stackArray = newStack;
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

       
        stack.push(10);
        stack.push(20);
        stack.push(30);

       
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

       
        System.out.println("Is stack empty? " + stack.isEmpty());

       
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
