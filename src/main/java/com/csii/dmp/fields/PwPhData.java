package com.csii.dmp.fields;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 16:37
 */
public class PwPhData {
    static int[][] arr = {{640,480},{480,320},{800,480},{960,640},{960,540},{1136,640},
            {1280,720},{1920,1080},{1024,768},{2560,1600},{2560,1440},{1200,600}};
    public static int getLen(){
        return arr.length;
    }
    public static int getPw(int index){
        return arr[index][0];
    }
    public static int getPh(int index){
        return arr[index][1];
    }

}