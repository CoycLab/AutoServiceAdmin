package com.github.coyclab.utils;

import java.util.Comparator;

public class MyList<E> implements IList<E> {

    private int actualItemsCount;
    private int actualArraySize;
    private Object[] array;
    private int index;

    public MyList() {
        actualItemsCount = 0;
        index = 0;
        actualArraySize = Constants.DEFAULT_ARRAY_SIZE;
        array = new Object[actualArraySize];
    }

    @Override
    public boolean add(E o) {
        if (isFreeSpace()) {
            index = getFreeIndex();
            array[index] = o;
            actualItemsCount++;
        } else {
            grow();
        }
        return true;
    }

    private void grow() {
        System.out.println("NO space available");
    }

    @Override
    public boolean remove(E o) {
        return false;
    }

    @Override
    public void sort(Comparator comparator) {

    }

    private boolean isFreeSpace() {
        return actualItemsCount <= actualArraySize;
    }

    private int getFreeIndex() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append("list[" + i + "] --> " + array[i])
                    .append("\n");
        }
        return builder.toString();
    }

    public int size() {
        return this.actualItemsCount;
    }
}
