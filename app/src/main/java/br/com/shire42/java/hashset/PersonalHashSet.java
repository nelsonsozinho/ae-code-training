package br.com.shire42.java.hashset;

import java.util.LinkedList;

public class PersonalHashSet<T> {

    private static final int FAULT_CAPACITY = 20;

    private LinkedList<T>[] buckets;

    public PersonalHashSet() {
        buckets = new LinkedList[FAULT_CAPACITY];
    }

    public boolean add(T element) {
        int index = getIndex(element);

        if(buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        LinkedList<T> bucket = buckets[index];

        for(T e : bucket) {
            if(e.equals(element)) {
                return false;
            }
        }

        bucket.add(element);
        return false;
    }

    public boolean contains(T element) {
        if (element == null) return false;

        int index = getIndex(element);
        LinkedList<T> elements = buckets[index];

        return elements != null && elements.stream().anyMatch(item -> item.equals(element));
    }

    public boolean remove(T element) {
        int index = getIndex(element);

        LinkedList<T> bucket = buckets[index];
        if(bucket == null) return false;

        return bucket.remove(element);
    }

    private int getIndex(T value) {
        int hash = (value == null) ? 0 : value.hashCode();
        return Math.abs(hash) % buckets.length;
    }

}
