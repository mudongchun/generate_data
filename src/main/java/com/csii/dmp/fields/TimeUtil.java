package com.csii.dmp.fields;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/22 16:08
 */
public class TimeUtil {
    static DateFormatUtils du = new DateFormatUtils();
    static String format="yyyy-MM-dd";

    public static String formateDateToStr(Date date){
        return du.format(date,format);
    }


}
