package com.example.android_databinding;

import androidx.databinding.BaseObservable;

public class Person {
    public String getName() {
        return name;
    }

    public final String name;

    public Person(String name) {
        this.name = name;
    }



}
