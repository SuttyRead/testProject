package com.ua.sutty.prepare;

public class Cat extends Animal implements Behavior{
    String name = Behavior.name;
    @Override
    public String say() {
        return super.say();
    }

    public String woof() {
        return null;
    }



}
