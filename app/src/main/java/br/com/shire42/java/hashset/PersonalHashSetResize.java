package br.com.shire42.java.hashset;

import java.util.LinkedList;

public class PersonalHashSetResize<T> {

    private static final int DEFAULT_CAPACITY = 20;
    private static final float LOAD_FACTOR  = 0.75f;

    private LinkedList<T>[] buckets;
    private int size = 0;
    private int threshold;

    public PersonalHashSetResize() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        threshold = (int) (DEFAULT_CAPACITY * LOAD_FACTOR);
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
        size++;

        if(size > threshold) {
            resize();
        }

        return true;
    }

    public boolean remove(T element) {
        int index = getIndex(element);
        LinkedList<T> bucket = buckets[index];

        if(bucket == null) {
            return false;
        }

        boolean removed = bucket.remove(element);
        if (removed) size--;

        return removed;
    }

    private void resize() {
        LinkedList<T>[] oldBucket = buckets;

        int newCapacity = buckets.length * 2;
        buckets = new LinkedList[newCapacity];
        threshold = (int) (newCapacity * LOAD_FACTOR);

        size = 0;

        for(LinkedList<T> bucket: buckets) {
            if(bucket != null) {
                for(T element : bucket) {
                    // method to add
                }
            }
        }

    }

    private int getIndex(T elemnt) {
        int hash = (elemnt == null) ? 0 : elemnt.hashCode();
        return Math.abs(hash) % buckets.length;
    }

    public int size() {
        return size;
    }

}
