package com.company;

/**
 * Created by androiddevelopment on 4/1/17.
 */
public class MySingletone {
    private static MySingletone m = new MySingletone();

    private MySingletone(){

    }

    public static MySingletone getInstance(){
        return m;
    }
}
