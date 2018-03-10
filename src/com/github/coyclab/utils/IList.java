package com.github.coyclab.utils;

import java.util.Comparator;

public interface IList<E> {
    boolean add(E e);
    boolean remove(E e);
    void sort(Comparator comparator);
}
