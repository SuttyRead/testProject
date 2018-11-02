package com.ua.sutty.prepare;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Animal {

    protected String say() {
        return "Hello";
    }


    public Set<String> strings = new HashSet<>();

    public Set<String> getStrings() {
        return strings;
    }

    public void setStrings(Set<String> strings) {
        this.strings = strings;
    }



}
