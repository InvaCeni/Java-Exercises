package org.example;
import java.util.LinkedList;

class SDAHashSet<E> {
    private LinkedList<E>[] table;
    private int size;
    private static final int INITIAL_CAPACITY = 16;

    public SDAHashSet() {
        table = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    public boolean add(E element) {
        if (!contains(element)) {
            int index = getIndex(element);
            table[index].add(element);
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(E element) {
        int index = getIndex(element);
        if (table[index].remove(element)) {
            size--;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        int index = getIndex(element);
        return table[index].contains(element);
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i].clear();
        }
        size = 0;
    }

    private int getIndex(E element) {
        return Math.abs(element.hashCode() % table.length);
    }
}


