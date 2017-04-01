package com.company;

public class Main {

    public static void main(String[] args) {

	    //Builder ex:
        MyBuilder myBuilder = new MyBuilder();
        myBuilder.setHight(2,3).setColor("red");


        //Singletone ex:
        MySingletone a = MySingletone.getInstance();
        MySingletone b = MySingletone.getInstance();
    }
}
