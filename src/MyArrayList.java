import java.util.Iterator;

public class MyArrayList<T> implements myList<T> {
    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is not correct!");
        }
    }
    public void printArr(){
        for (int i = 0; i<size; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    @Override
    public void add(T item) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        if (size >= arr.length) {
            increaseBuffer();
        }
        arr[index] = item;
    }

    @Override
    public void add(int index, T item) {
        checkIndex(index);
        if (size >= arr.length) {
            increaseBuffer();
        }
        for (int i = size - 1; i <= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = item;
    }

    @Override
    public void addFirst(T item) {
        arr[0] = item;

    }

    @Override
    public void addLast(T item) {
        arr[arr.length - 1] = item;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        return arr[0];
    }

    @Override
    public T getLast() {
        return arr[arr.length - 1];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        for (int i = 0; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeLast() {
        for (int i = size - 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) arr[j]).compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == object) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i != 0; i--) {
            if (arr[i] == object) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == object) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
