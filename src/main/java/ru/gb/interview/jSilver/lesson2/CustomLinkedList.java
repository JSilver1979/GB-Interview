package ru.gb.interview.jSilver.lesson2;

public class CustomLinkedList<E> {

    private int size;
    private Element<E> first;
    private Element<E> last;

    public CustomLinkedList() {
    }

    private void addFirst(E element) {
        final Element<E> f = first;
        final Element<E> newElement = new Element<>(element, null, f);
        first = newElement;
        if (f == null) {
            last = newElement;
        } else {
            f.left = newElement;
        }
        size++;
    }

    private void addLast(E element) {
        final Element<E> l = last;
        final Element<E> newElement = new Element<>(element, l, null);
        last = newElement;
        if (l == null) {
            first = newElement;
        } else {
            l.right = newElement;
        }
        size++;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public boolean exclude(Object obj) {
        if (obj == null) {
            excludeNullElement();
        } else {
            exludeElement(obj);
        }
        return false;
    }

    private boolean excludeNullElement() {
        for (Element<E> e = first; e != null; e = e.right) {
            if (e.element == null) {
                remove(e);
                return true;
            }
        }
        return false;
    }

    private boolean exludeElement(Object obj) {
        for (Element<E> e = first; e != null; e = e.right) {
            if (obj.equals(e.element)) {
                remove(e);
                return true;
            }
        }
        return false;
    }

    private E remove(Element<E> e) {
        final E element = e.element;
        final Element<E> left = e.left;
        final Element<E> right = e.right;

        if (left == null) {
            first = right;
        } else {
            left.right = right;
            e.left = null;
        }

        if (right == null) {
            last = left;
        } else {
            right.left = left;
            e.right = null;
        }
        e.element = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    private static class Element<E> {
        E element;
        Element<E> left;
        Element<E> right;

        public Element(E element, Element<E> left, Element<E> right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element<E> e = first; e != null; e = e.right) {
            sb.append("[").append(e).append("] ");
        }
        return sb.toString();
    }
}
