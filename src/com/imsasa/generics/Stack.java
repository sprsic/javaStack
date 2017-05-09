package com.imsasa.generics;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Written with love
 *
 * @author Sasa Prsic 09/05/2017
 */

public class Stack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    // put suppress warnings on low level
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    // simple push to stack
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        // prevent memory leak
        // obsolete reference prepare for gc
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private void ensureCapacity() {
        if (elements.length == size)
            // if no space left in stack double the capacity
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
