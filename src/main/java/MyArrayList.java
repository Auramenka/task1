import java.util.Arrays;


public class MyArrayList<T> {

    private T[] array;
    private int size;
    private final int INITIAL_CAPACITY = 10;

    public MyArrayList(){
        array = (T[]) new Object[INITIAL_CAPACITY];
    }

    public boolean add(T element){
        resize();
        array[size] = element;
        size++;
        return true;
    }

    public void add(int index, T element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        resize();

        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    private void resize(){
        if (array.length == size) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index = " + index + " out of bounds");
        }
    }

    public T get(int index){
        checkIndex(index);
        return (T) array[index];
    }

    public int size(){
       return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        size = 0;
        array = (T[]) new Object[INITIAL_CAPACITY];
    }

    public T remove(int index){
        checkIndex(index);
        T element = (T) array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return element;
    }

    public Object[] toArray(){
        return Arrays.copyOf(array, size);
    }
}
