package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 17:46
 */
public class NetworkData {
    static String[][] arr = {{"0", "WIFI"}, {"1", "2G"}, {"2", "3G"},{"3", "4G"},{"4", "5G"}};

    public static int getLen() {
        return arr.length;
    }

    public static int getNetworkmannerId(int index) {
        return Integer.parseInt(arr[index][0]);
    }

    public static String getNetworkmannerName(int index) {
        return arr[index][1];
    }

}
