package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/23 10:30
 */
public class DeviceData {
    static String[] arr = {"Apple iPhone 11", "Apple iPhone 11 Pro", "Apple iPhone XR", "Apple iPhone 8", "Apple iPhone 7 Plus",
            "Apple iPhone 7", "Apple iPhone 6 Plus", "Apple iPhone 6", "HUAWEI Mate 30 Pro", "荣耀20", "HUAWEI nova 5z", "荣耀9X",
            "荣耀V20", "HUAWEI P30", "荣耀Play3", "华为畅享10", "HUAWEI Mate 30", "HUAWEI Mate 20 Pro", "HUAWEI nova 4z", "荣耀8X",
            "荣耀V10", "HUAWEI P20", "荣耀Play2", "华为畅享9", "HUAWEI Mate 10", "HUAWEI Mate 10 Pro", "HUAWEI nova 3z", "荣耀7X",
            "荣耀V9", "HUAWEI P10 ", "荣耀Play1", "华为畅享8", "HUAWEI Mate 9", "HUAWEI Mate 9 Pro", "HUAWEI nova 2z", "荣耀6X",
            "小米9 Pro 5G", "Redmi 8", "Redmi Note 8 Pro", "Redmi Note 8", "Redmi K20 Pro", "Redmi Note 7", "Redmi 7", "Redmi 7A",
            "小米9 Pro 4G", "Redmi 6", "Redmi Note 6 Pro", "Redmi Note 6", "Redmi K10 Pro", "Redmi Note 5", "Redmi 5", "Redmi 5A",
            "vivo NEX 3", "vivo IQOO Pro", "vivo Z5x", "vivo Z5", "vivo X27", "vivo IQOO Neo", "vivo S1 Pro", "vivo Y3", "vivo X23",
            "vivo Y91", "vivo X20", "vivo X9s Plus", "vivo Y75", "vivo U1", "vivo Z3", "vivo Z3X", "vivo Y81s", "vivo Y79",
            "OPPO Reno Ace", "OPPO Reno2", "OPPO K5", "OPPO Reno", "OPPO K3", "OPPO R17", "OPPO A9", "OPPO R17 Pro", "OPPO A7",
            "OPPO A9x", "OPPO Reno Z", "OPPO Find X", "OPPO K1", "OPPO R15x", "OPPO R11 Plus", "OPPO A73", "OPPO A59", "OPPO R15",
            "HUAWEI 5i Pro", "华为畅享10 Plus", "华为畅享9s", "华为畅享8s", "HUAWEI P30 Plus", "HUAWEI P20 Plus", "HUAWEI P10 Plus",
            "HUAWEI P30 Pro", "HUAWEI P20 Pro", "HUAWEI P10 Pro", "Samsung GALAXY Note 10", "Samsung GALAXY Note 10 Plus",
            "Samsung GALAXY S10", "Samsung GALAXY S10 Plus", "Samsung GALAXY Fold", "Samsung GALAXY S11", "Samsung GALAXY S11 Plus",
            "Samsung GALAXY Note 9", "Samsung GALAXY Note 9 Plus", "Samsung GALAXY A8s", "Samsung GALAXY S9", "Samsung GALAXY S9 Plus",
            "魅族16T", "魅族16s Pro", "魅族16th", "魅族16Xs", "魅族16th Plus", "魅族15T", "魅族15s Pro", "魅族15th", "魅族15Xs", "魅族15th Plus",
            "魅族13T", "魅族13s Pro", "魅族13th", "魅族13Xs", "魅族13th Plus", "魅族11T", "魅族11s Pro", "魅族11th", "魅族11Xs", "魅族11th Plus",
            "联想Z6 Pro", "联想Z6", "联想Z6 5G", "联想Z5 Pro", "联想Z5", "联想A5", "联想S5 Pro GT", "联想K5s", "联想K5 Note", "联想K5 Play",
            "联想K10 Note", "联想A6 Note", "一加7T", "一加7 Pro", "一加7", "一加8T", "一加8 Pro", "一加8", "一加6T", "一加6 Pro", "一加6",
            "一加5T", "一加5 Pro", "一加5", "诺基亚9 PureView", "诺基亚X7", "诺基亚7", "诺基亚7 Plus", "诺基亚X71", "诺基亚X6", "诺基亚6",
            "诺基亚6 Plus"};

    public static String getRandomDevice() {
        return arr[DataRandom.getRandomInt(arr.length)];
    }
}
