package MateAcademy.OOP.ArrayList.HwTask;

import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 10;
    private static final double SIZE_MULTIPLY = 1.5;
    private T[] array;
    private int size;


    @SuppressWarnings("unchecked")
    public ArrayList() {
        array = (T[]) new Object[DEFAULT_SIZE];
        size = 0;
    }

    @Override
    public void add(T value) {
        increaseSize();
        array[size++] = value;
    }

    @Override
    public void add(T value, int index) {
        checkAddIndex(index);
        increaseSize();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    @Override
    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void set(T value, int index) {
        checkIndex(index);
        array[index] = value;
    }

    @Override
    public T remove(int index) throws ArrayListIndexOutOfBoundsException {
        checkIndex(index);
        T deletedValue = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return deletedValue;
    }

    @Override
    public T remove(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(element) || array[i] == element) {
                return remove(i);
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void increaseSize() {
        if (array.length == size) {
            T[] increasedArray = (T[]) new Object[(int) (array.length * DEFAULT_SIZE)];
            System.arraycopy(array, 0, increasedArray, 0, size);
            array = increasedArray;
        }
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new ArrayListIndexOutOfBoundsException("Input index " + index
                    + "out of bound " + size);
        }
    }

    private void checkAddIndex(int index) {
        if (index > size || index < 0) {
            throw new ArrayListIndexOutOfBoundsException("Input index " + index
                    + "out of bound " + size);
        }
    }
}