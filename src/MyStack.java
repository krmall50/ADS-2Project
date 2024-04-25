import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] arr;
    private int topIndex;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        topIndex = -1;
    }
    public T get(int index){
        return arr[index];
    }

    public void push(T item) {
        if (isFull()) {
            throw new IllegalStateException("Stack already full!");
        }
        arr[++topIndex] = item;
    }

    public T pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        T item = arr[topIndex];
        arr[topIndex--] = null;
        return item;
    }

    public T peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return arr[topIndex];
    }

    public boolean empty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == capacity - 1;
    }

    public int size() {
        return topIndex + 1;
    }
}
