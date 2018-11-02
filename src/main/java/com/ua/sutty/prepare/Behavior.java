package com.ua.sutty.prepare;

public interface Behavior {
    public static final String name = "Hello";
    public abstract String woof();
    static String  say(){
        return "Hello";
    }

    default void helloSaY(){

    }

}
