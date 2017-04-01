package com.company;

/**
 * Created by androiddevelopment on 4/1/17.
 */
public class MyBuilder {
    private int a,b;
    private String color;

    public MyBuilder setHight(int a, int b){
        this.a = a;
        this.b = b;

        return this;
    }

    public MyBuilder setColor(String color){
        this.color = color;
        return this;
    }
}
