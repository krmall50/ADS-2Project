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
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index is not correct!");
        }
    }

    @Override
    public void add(T item) {
        if(size>=arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        if(size>=arr.length){
            increaseBuffer();
        }
        arr[index] = item;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {
        arr[0] = item;

    }

    @Override
    public void addLast(T item) {
        arr[arr.length-1] = item;
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
        return arr[arr.length-1];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index+1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        for (int i = 0; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeLast() {
        for (int i = size-1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
