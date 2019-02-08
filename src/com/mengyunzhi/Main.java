package com.mengyunzhi;

import com.mengyunzhi.array.Array;

public class Main {

    public static void main(String[] args) {
        Array array = new Array(20);
        for (int i = 0; i < 10; i ++) {
            array.add(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);
        array.add(0, -1);
        System.out.println(array);
    }
}
