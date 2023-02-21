package ru.gb.interview.jSilver.lesson2;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList<E> extends AbstractList<E> implements List<E> {

    private static final int DEFAULT_SIZE = 5;

    private int size;

    private Object[] objects;

    public CustomArrayList(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            this.size = DEFAULT_SIZE;
        }
        objects = new Object[size];
    }

    public CustomArrayList() {
        this.size = DEFAULT_SIZE;
        objects = new Object[size];
    }

    private Object[] increase() {
        size += 1;
        return objects = Arrays.copyOf(objects, size);

    }

    @Override
    public E get(int index) {
        checkBounds(index);
        return (E) objects[index];
    }

    private void add(E e, int index) {
        if (index == objects.length) {
            increase();
            objects[index] = e;
        }
    }

    @Override
    public boolean add(E e) {
        add(e, size);
        return true;
    }

    @Override
    public E remove(int index) {
        checkBounds(index);
        E removedElement = get(index);
        if (index == size - 1) {
            objects = Arrays.copyOf(objects, index);
        } else {
            concatenate(index);
        }
        size--;
        return removedElement;
    }

    @Override
    public E set(int index, E element) {
        checkBounds(index);
        objects[index] = element;
        return (E) objects[index];
    }

    private void concatenate(int index) {
        Object[] leftObjects = Arrays.copyOf(objects, index);
        Object[] rightObjects = Arrays.copyOfRange(objects, index + 1, objects.length);

        objects = Arrays.copyOf(leftObjects, leftObjects.length + rightObjects.length);
        System.arraycopy(rightObjects, 0, objects, leftObjects.length, rightObjects.length);
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= objects.length) {
            throw new IndexOutOfBoundsException(index + " is out of bounds of CustomArrayList");
        }
    }

    @Override
    public int size() {
        return size;
    }
}
