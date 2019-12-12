package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 15:10
 */
public class SdkVersionData {
    static String[] sdkversions = {"Android 5.0", "Android 6.0", "Android 7.0", "Android 8.0", "Android 9.0",
            "IOS 10.0", "IOS 10.1", "IOS 10.2", "IOS 10.3", "IOS 10.4", "IOS 11.0", "IOS 11.1", "IOS 11.2", "IOS 11.3",
            "IOS 11.4","IOS 12.0","IOS 12.1","IOS 12.2","IOS 12.3","IOS 12.4","IOS 13.0"};
    public static String getRandomSdkVersion(){
        return sdkversions[DataRandom.getRandomInt(sdkversions.length)];
    }

}
