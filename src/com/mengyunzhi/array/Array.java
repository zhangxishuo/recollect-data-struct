package com.mengyunzhi.array;

public class Array {

    private int[] data;

    private int size;

    /**
     * 用传入的容量构造数组
     * @param capacity 容量
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认数组容量为10
     */
    public Array() {
        this(10);
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        add(size, element);
    }

    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("错误");
        }
        if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size ++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("错误");
        }
        return data[index];
    }

    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("错误");
        }
        data[index] = element;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i ++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i ++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        builder.append('[');
        for (int i = 0; i < size; i ++) {
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }
}
