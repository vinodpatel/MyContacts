package com.example.smita.doggydogworld;

import android.util.Log;

/**
 * Created by Smita on 13-Feb-2015.
 */
public class Dog {
    private String name ;
    private String bread;
    private int age;
    private int numberOfLegs = 4;

    Dog(){
        Log.d("Dog", "Constructing...");
    }

    Dog(String dogName){
        name = dogName ;
    }
    public void bark(){
        String bark = name + " barked";
        Log.d("Dog", bark);
    }
    public void bark(String victim){
        String bark = name + " barked at "+victim;
        Log.d("Dog", bark);
    }
}
