public class Stack {
    private int top;
    private int size;
    private int[] arr;

    public Stack(int length) {
        arr = new int[length];
        top = -1;
        size = 0;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            arr[top] = data;
            size++;
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = arr[top];
        top--;
        size--;
        return data;
    }

    public Integer peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }
    public int getSize(){return size;}
}