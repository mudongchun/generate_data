package com.csii.dmp.fields;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFaker {
    static Faker faker = new Faker(new Locale("zh-CN"));
    public static Faker getFaker(){
        return faker;
    }
}
