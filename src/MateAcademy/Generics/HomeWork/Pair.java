package MateAcademy.Generics.HomeWork;

import java.util.Objects;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object pair) {
        if (this == pair) {
            return true;
        }
        if (pair == null || getClass() != pair.getClass()) {
            return false;
        }
        if (pair.getClass().equals(Pair.class)) {
            Pair current = (Pair) pair;
            return Objects.equals(this.key, current.key)
                    && Objects.equals(this.value, current.value);
        }
        return false;

    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}

