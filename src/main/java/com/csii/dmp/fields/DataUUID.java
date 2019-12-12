package com.csii.dmp.fields;

import com.github.javafaker.Faker;

public class DataUUID {
    public static String getLowerUUID(Faker faker){
        return faker.internet().uuid().toLowerCase().replaceAll("-","");
    }

    public static String getUpperUUID(Faker faker){
        return faker.internet().uuid().toUpperCase().replaceAll("-","");
    }
}
