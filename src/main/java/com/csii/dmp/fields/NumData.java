package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 17:58
 */
public class NumData {
    static int[] arr1 = {1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    static int[] arr2 = {0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static int getTwoNumLen() {
        return arr1.length;
    }

    public static int getThreeNumLen() {
        return arr2.length;
    }

    public static int getMoreOne(int index) {
        return arr1[index];
    }

    public static int getMoreZero(int index) {
        return arr2[index];
    }

}
