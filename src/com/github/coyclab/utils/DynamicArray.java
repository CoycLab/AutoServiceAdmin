package com.github.coyclab.utils;

import com.github.coyclab.api.IList;

import java.util.Arrays;

public class DynamicArray<T> implements IList<T> {

    private Object[] array;
    private int itemsCount;
    private int arraySize;

    public DynamicArray() {
        itemsCount = 0;
        arraySize = Constants.DEFAULT_ARRAY_SIZE;
        array = new Object[arraySize];
    }

    @Override
    public boolean add(T obj) {
        if (isFreeSpace()) {
            int index = getFreeIndex();
            array[index] = obj;
            itemsCount++;
        } else {
            grow(arraySize / 2);
            add(obj);
        }
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (array[index] == null) {
            return false;
        } else {
            array[index] = null;
            itemsCount--;
            return true;
        }
    }

    @Override
    public boolean remove(T object) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(object)){
                array[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public void sort() {
        Arrays.sort(array);
    }

    public int size() {
        return itemsCount;
    }

    private void grow(int growSize) {
        Object[] temp = new Object[arraySize += growSize];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    private boolean isFreeSpace() {
        return itemsCount < arraySize;
    }

    private int getFreeIndex() {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append("[" + i + "] --> " + array[i])
                    .append("\n");
        }
        return builder.toString();
    }
}
