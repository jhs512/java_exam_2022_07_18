package com.ll.exam;

public class HashMap<K, V> {
    private Object[] keys;
    private Object[] values;
    private int size;

    HashMap() {
        size = 0;
        keys = new Object[100];
        values = new Object[100];
    }

    public void put(K key, V value) {
        int keyIndex = indexOfKey(key);

        if (keyIndex != -1) {
            values[keyIndex] = value;
            return;
        }

        keys[size] = key;
        values[size] = value;

        size++;
    }

    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                return i;
            }
        }

        return -1;
    }

    public V get(K key) {
        int keyIndex = indexOfKey(key);

        if (keyIndex == -1) {
            return null;
        }

        return (V) values[keyIndex];
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        int keyIndex = indexOfKey(key);

        if (keyIndex == -1) {
            return;
        }

        moveLeft(keys, keyIndex + 1, size - 1);
        moveLeft(values, keyIndex + 1, size - 1);

        size--;
    }

    private void moveLeft(Object[] arr, int fromIndex, int toIndex) {
        for (int i = fromIndex; i <= toIndex; i++) {
            arr[i - 1] = arr[i];
        }
    }
}
