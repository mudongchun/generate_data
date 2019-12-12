package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 16:59
 */
public class IspData {
    static String[][] arr = {{"46001", "移动"}, {"46002", "联通"}, {"46003", "电信"}};

    public static int getLen() {
        return arr.length;
    }

    public static int getIspId(int index) {
        return Integer.parseInt(arr[index][0]);
    }

    public static String getIspName(int index) {
        return arr[index][1];
    }

}
