package com.csii.dmp.data;


import com.csii.dmp.fields.DataRandom;
import com.csii.dmp.fields.TimeUtil;

import java.io.*;
import java.util.Date;

/**
 * @Description TODO
 * @Author KG21_YANG
 * @Date 2019/10/21 15:12
 */
public class GenerateData {

    public static void main(String[] args) {
        int totalnums = 119;

        if (args.length > 0) {
            String count = args[0];
            totalnums = Integer.parseInt(count);
        }

        int num = 0;
        while (true) {
            try {
                FileOutputStream fos = new FileOutputStream(File.separator + "opt" + File.separator + "dmplog" + File.separator + "dmp.log." + TimeUtil.formateDateToStr(new Date()) + "-" + num + ".json", true);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                for (int i = 0; i < 100000; i++) {
                    Thread.sleep(DataRandom.getRandomInt(8));
                    String jsonData = JsonData.produceJsonData();
                    bos.write(jsonData.getBytes());
                }
                bos.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            num++;
            if (num >= totalnums) {
                System.exit(0);
            }
        }
    }

}
