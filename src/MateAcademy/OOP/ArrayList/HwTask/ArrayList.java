package MateAcademy.OOP.ArrayList.HwTask;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double SIZE_MULTIPLIER = 1.5;
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
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
            if (Objects.equals(array[i], element)) {
                T removedElement = array[i];
                for (int j = i + 1; j < size; j++) {
                    array[j - 1] = array[j];
                }
                array[size--] = null;
                return removedElement;
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

    private void increaseSize() {
        if (array.length == size) {
            int newCapacity = (int) (array.length * SIZE_MULTIPLIER);
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayListIndexOutOfBoundsException("Index "
                    + index
                    + " is out of bounds for size "
                    + size);
        }
    }

    private void checkAddIndex(int index) {
        if (index > size || index < 0) {
            throw new ArrayListIndexOutOfBoundsException("Invalid index value: "
                    + index
                    + ", list size: "
                    + size);
        }
    }
}
