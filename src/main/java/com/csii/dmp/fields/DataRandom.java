package com.csii.dmp.fields;

import java.util.Random;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 9:15
 */
public class DataRandom {
    static Random rd = new Random();

    public static int getRandomInt(int num) {
        return rd.nextInt(num);
    }

    public static int getRandomInt(int num, int b) {
        return rd.nextInt(num)+b;
    }

}
