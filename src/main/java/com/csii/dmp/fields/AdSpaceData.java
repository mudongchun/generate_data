package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 17:51
 */
public class AdSpaceData {
    static String[][] arr = {{"1", "banner"}, {"2", "插屏"}, {"3", "全屏"}};

    public static int getLen() {
        return arr.length;
    }

    public static int getAdspaceType(int index) {
        return Integer.parseInt(arr[index][0]);
    }

    public static String getAdspacetypeName(int index) {
        return arr[index][1];
    }
}
