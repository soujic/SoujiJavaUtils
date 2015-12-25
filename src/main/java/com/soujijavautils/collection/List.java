package com.soujijavautils.collection;

import java.util.Objects;

/**
 * Created by soujanya.
 */
public interface List<T> {

    int size();

    boolean add(T item);

    T get(int index);

    T[] toArray();

    boolean isEmpty();

    boolean contains(T o);

    int indexOf(T o);


}
