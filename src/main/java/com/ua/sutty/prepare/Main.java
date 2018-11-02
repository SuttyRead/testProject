package com.ua.sutty.prepare;

import java.lang.reflect.Field;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Set<Integer> integerSet = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("initial size = " + arr.size()); // 0
        System.out.println("initial capacity = " + getCapacity(arr));

        for (int i = 0; i < 10; i++)
            arr.add(i);

        System.out.println("size = " + arr.size()); // 11
        System.out.println("capacity = " + getCapacity(arr));



    }
    static int getCapacity (ArrayList < ? > l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}


