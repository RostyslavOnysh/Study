package MateAcademy.Generics.JV_storage.basesyntax.impl;

import MateAcademy.Generics.JV_storage.basesyntax.Storage;

import java.util.Arrays;
import java.util.Objects;

public class StorageImpl<K, V> implements Storage<K, V> {

    private K[] keys;
    private V[] values;
    private int size;

    public StorageImpl() {
        keys = (K[]) new Object[10];
        values = (V[]) new Object[10];
        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageImpl current = (StorageImpl) o;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(keys[i], current.keys[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(keys);
        result = 31 * result + Arrays.hashCode(values);
        return result;
    }

    @Override
    public void put(K key, V value) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(keys[i], key)) {
                values[i] = value;
                found = true;
                break;
            }
        }
        if (!found) {
            keys[size] = key;
            values[size] = value;
            size++;
        }
        if (size == keys.length) {
            keys = Arrays.copyOf(keys, size * 2);
            values = Arrays.copyOf(values, size * 2);
        }
        keys[size] = key;


    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(keys[i], key)) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }


}


/*
цю задачу можна вирішити ще таким шляхом :
1. використання equals() and hashCode() не є обов'язковим,замість цього можна додати просто
перевірку на null до методів put(K key, V value),get(K key).

public class StorageImpl<K, V> implements Storage<K, V> {
    private static final int DEFAULT_SIZE = 10;
    private static final int ARRAY_MULTIPLIER = 2;
    private K[] keys;
    private V[] values;
    private int size;

    public StorageImpl() {
        keys = createKeyArray();
        values = createValueArray();
    }

    @SuppressWarnings("unchecked")
    private K[] createKeyArray() {
        return (K[]) new Object[StorageImpl.DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    private V[] createValueArray() {
        return (V[]) new Object[StorageImpl.DEFAULT_SIZE];
    }

    public void put(K key, V value) {
        boolean found = false;
        if (key == null) {
            for (int i = 0; i < size; i++) {
                if (keys[i] == null) {
                    values[i] = value;
                    found = true;
                    break;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (key.equals(keys[i])) {
                    values[i] = value;
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            keys[size] = key;
            values[size] = value;
            size++;
        }
        if (size == keys.length) {
            keys = Arrays.copyOf(keys, size * ARRAY_MULTIPLIER);
            values = Arrays.copyOf(values, size * ARRAY_MULTIPLIER);
        }
    }

    public V get(K key) {
        if (key == null) {
            for (int i = 0; i < size; i++) {
                if (keys[i] == null) {
                    return values[i];
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (key.equals(keys[i])) {
                    return values[i];
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

}

 */