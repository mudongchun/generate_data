package com.csii.dmp.data;

import com.csii.dmp.fields.*;
import com.github.javafaker.Faker;

import java.util.Date;


public class JsonData {
/*    public static void main(String[] args) {
        System.out.println(produceJsonData());
    }*/

    public static String produceJsonData() {
        Faker fak = DataFaker.getFaker();

        StringBuffer sb = new StringBuffer();
        String lineSeparator = System.getProperty("line.separator", "\n");

        //1.sessionid, Type.STRING,会话标识---uuid
        String sessionid = DataUUID.getUpperUUID(fak);
        sb.append("{").append("\"sessionid\":").append("\"").append(sessionid).append("\"").append(",");

        //2.advertisersid, Type.INT64,广告主ID---[0,100)
        int advertisersid = DataRandom.getRandomInt(100);
        sb.append("\"advertisersid\":").append(advertisersid).append(",");

        //3.adorderid, Type.INT64,广告ID---[900,200000)
        int adorderid = DataRandom.getRandomInt(199100,900);
        sb.append("\"adorderid\":").append(adorderid).append(",");

        //4.adcreativeid, Type.INT64,广告创意ID( >= 200000 : dsp , < 200000 oss)---[100000,3000000)
        int adcreativeid = DataRandom.getRandomInt(2900000,100000);
        sb.append("\"adcreativeid\":").append(adcreativeid).append(",");

        //5.adplatformproviderid, Type.INT64	广告平台商ID(>= 100000: rtb , < 100000 : api )---[10000,1000000)
        int adplatformproviderid = DataRandom.getRandomInt(990000,10000);
        sb.append("\"adplatformproviderid\":").append(adplatformproviderid).append(",");

        //6.sdkversion, Type.STRING	SDK版本号---Android{5.0,6,0,7.0}  IOS{10.1~11.9}
        String sdkversion = SdkVersionData.getRandomSdkVersion();
        sb.append("\"sdkversion\":").append("\"").append(sdkversion).append("\"").append(",");

        //7.adplatformkey, Type.STRING,平台商key---uuid
        String adplatformkey = DataUUID.getLowerUUID(fak);
        sb.append("\"adplatformkey\":").append("\"").append(adplatformkey).append("\"").append(",");

        //8.putinmodeltype, Type.INT64	针对广告主的投放模式,1：展示量投放 2：点击量投放---{1,2}
        int putinmodeltype = DataRandom.getRandomInt(2,1);
        sb.append("\"putinmodeltype\":").append(putinmodeltype).append(",");

        //9.requestmode, Type.INT64,数据请求方式（1:请求、2:展示、3:点击）---[1,3]
        int requestmode = DataRandom.getRandomInt(3,1);
        sb.append("\"requestmode\":").append(requestmode).append(",");

        //10.adprice, Type.DOUBLE,广告价格---[500,10000)
        double adprice = DataRandom.getRandomInt(9500,500);
        sb.append("\"adprice\":").append(adprice).append(",");

        //11.adppprice, Type.DOUBLE,平台商价格---
        double adppprice = DataRandom.getRandomInt(9500,500);
        sb.append("\"adppprice\":").append(adppprice).append(",");

        //12.requestdate, Type.STRING,请求时间,格式为：yyyy-m-dd---TimeUtil.formateDateToStr(new Date());
        String requestdate = TimeUtil.formateDateToStr(new Date());
        sb.append("\"requestdate\":").append("\"").append(requestdate).append("\"").append(",");

        //13.ip, Type.STRING,用户ip---IPData.getRandomIp()
        String ip = IPData.getRandomIp();
        sb.append("\"ip\":").append("\"").append(ip).append("\"").append(",");

        //14.appid, Type.STRING	应用id---AppData
        int appDataLength = AppData.getAppDataLength();
        int appIndex = DataRandom.getRandomInt(appDataLength);
        String appid = AppData.getAppId(appIndex);
        sb.append("\"appid\":").append("\"").append(appid).append("\"").append(",");

        //15.appname, Type.STRING应用名称---AppData
        String appname = AppData.getAppName(appIndex);
        sb.append("\"appname\":").append("\"").append(appname).append("\"").append(",");

        //16.uuid, Type.STRING,设备唯一标识，比如imei或者androidid等---uuid
        String uuid = DataUUID.getUpperUUID(fak);
        sb.append("\"uuid\":").append("\"").append(uuid).append("\"").append(",");

        //17.device, Type.STRING,设备型号，如htc、iphone---DeviceData
        String device = DeviceData.getRandomDevice();
        sb.append("\"device\":").append("\"").append(device).append("\"").append(",");


        //18.client, Type.INT64	设备类型（1：android 2：ios 3：wp）---[1,4]
        int client = DataRandom.getRandomInt(4,1);
        sb.append("\"client\":").append(client).append(",");

        //19.osversion, Type.STRING,设备操作系统版本，如4.0---""
        String osversion = "";
        sb.append("\"osversion\":").append("\"").append(osversion).append("\"").append(",");

        //20.density, Type.STRING,设备屏幕的密度android的取值为0.75、1、1.5,ios的取值为：1、2---""
        String density = "";
        sb.append("\"density\":").append("\"").append(density).append("\"").append(",");

        //21.pw, Type.INT64	设备屏幕宽度---PwPhData
        int pwphLength = PwPhData.getLen();
        int pwIndex = DataRandom.getRandomInt(pwphLength);
        int pw = PwPhData.getPw(pwIndex);
        sb.append("\"pw\":").append(pw).append(",");

        //22.ph, Type.INT64	设备屏幕宽度---PwPhData
        int ph = PwPhData.getPh(pwIndex);
        sb.append("\"ph\":").append(ph).append(",");

        //23.lang, Type.STRING,设备所在经度---""
        String lang = "";
        sb.append("\"lang\":").append("\"").append(lang).append("\"").append(",");

        //24.lat, Type.STRING,设备所在纬度---""
        String lat = "";
        sb.append("\"lat\":").append("\"").append(lat).append("\"").append(",");

        //25.provincename, Type.STRING设备所在省份名称---""
        String provincename = "";
        sb.append("\"provincename\":").append("\"").append(provincename).append("\"").append(",");

        //26.cityname, Type.STRING设备所在城市名称---""
        String cityname = "";
        sb.append("\"cityname\":").append("\"").append(cityname).append("\"").append(",");

        //27.ispid, Type.INT64,运营商id---IspData
        int ispLength = IspData.getLen();
        int ispIdIndex = DataRandom.getRandomInt(ispLength);
        int ispid = IspData.getIspId(ispIdIndex);
        sb.append("\"ispid\":").append(ispid).append(",");

        //28.ispname, Type.STRING,运营商名称---IspData
        String ispname = IspData.getIspName(ispIdIndex);
        sb.append("\"ispname\":").append("\"").append(ispname).append("\"").append(",");

        //29.networkmannerid, Type.INT64,联网方式id---NetworkData
        int networkIdLength = NetworkData.getLen();
        int networkIdIndex = DataRandom.getRandomInt(networkIdLength);
        int networkmannerid = NetworkData.getNetworkmannerId(networkIdIndex);
        sb.append("\"networkmannerid\":").append(networkmannerid).append(",");

        //30.networkmannername, Type.STRING	联网方式名称---NetworkData
        String networkmannername = NetworkData.getNetworkmannerName(networkIdIndex);
        sb.append("\"networkmannername\":").append("\"").append(networkmannername).append("\"").append(",");

        //31.iseffective, Type.INT64有效标识（有效指可以正常计费的）(0：无效 1：有效)---{0,1}
        int iseffective = DataRandom.getRandomInt(2);
        sb.append("\"iseffective\":").append(iseffective).append(",");

        //32.isbilling, Type.INT64,是否收费（0：未收费 1：已收费）---{0,1}
        int isbilling = DataRandom.getRandomInt(2);
        sb.append("\"isbilling\":").append(isbilling).append(",");

        //33.adspacetype, Type.INT64,广告位类型（1：banner 2：插屏 3：全屏）---AdSpaceData
        int adSpaceDataLength = AdSpaceData.getLen();
        int adSpaceDataIndex = DataRandom.getRandomInt(adSpaceDataLength);
        int adspacetype = AdSpaceData.getAdspaceType(adSpaceDataIndex);
        sb.append("\"adspacetype\":").append(adspacetype).append(",");

        //34.adspacetypename, Type.String,广告位类型（1：banner 2：插屏 3：全屏）---AdSpaceData
        String adspacetypename = AdSpaceData.getAdspacetypeName(adSpaceDataIndex);
        sb.append("\"adspacetypename\":").append("\"").append(adspacetypename).append("\"").append(",");


        //35.devicetype, Type.INT64	设备类型（1：手机 2：平板）---getMoreOne
        int twoNumLength = NumData.getTwoNumLen();
        int twoNumIndex0 = DataRandom.getRandomInt(twoNumLength);
        int devicetype = NumData.getMoreOne(twoNumIndex0);
        sb.append("\"devicetype\":").append(devicetype).append(",");

        //36.processnode, Type.INT64,流程节点（1：请求量kpi 2：有效请求 3：广告请求）---{1,2,3}
        int processnode = DataRandom.getRandomInt(3,1);
        sb.append("\"processnode\":").append(processnode).append(",");

        //37.apptype, Type.INT64应用类型id---getMoreZero
        int threeNumLength = NumData.getThreeNumLen();
        int threeNumIndex = DataRandom.getRandomInt(threeNumLength);
        int apptype = NumData.getMoreZero(threeNumIndex);
        sb.append("\"apptype\":").append(apptype).append(",");

        //38.district, Type.STRING,设备所在县名称---district
        String district = "district";
        sb.append("\"district\":").append("\"").append(district).append("\"").append(",");

        //39.paymode, Type.INT64,针对平台商的支付模式，1：展示量投放(CPM) 2：点击量投放(CPC)---getMoreOne
        int twoNumIndex1 = DataRandom.getRandomInt(twoNumLength);
        int paymode = NumData.getMoreOne(twoNumIndex1);
        sb.append("\"paymode\":").append(paymode).append(",");

        //40.isbid, Type.INT64,是否rtb---[0,1]
        int isbid = DataRandom.getRandomInt(2);
        sb.append("\"isbid\":").append(isbid).append(",");

        //41.bidprice, Type.DOUBLE,rtb竞价价格---[500,10000)
        double bidprice = DataRandom.getRandomInt(9500,500);
        sb.append("\"bidprice\":").append(bidprice).append(",");

        //42.winprice, Type.DOUBLE,rtb竞价成功价格---[10000,120000)
        double winprice = DataRandom.getRandomInt(110000,10000);
        sb.append("\"winprice\":").append(winprice).append(",");

        //43.iswin, Type.INT64,是否竞价成功---[0,1]
        int iswin = DataRandom.getRandomInt(2);
        sb.append("\"iswin\":").append(iswin).append(",");

        //44.cur, Type.STRING,values:usd|rmb等---"rmb"
        String cur = "rmb";
        sb.append("\"cur\":").append("\"").append(cur).append("\"").append(",");

        //45.rate, Type.DOUBLE汇率---0.0
        double rate = 0.0;
        sb.append("\"rate\":").append(rate).append(",");

        //46.cnywinprice, Type.DOUBLE,rtb竞价成功转换成人民币的价格---0.0
        double cnywinprice = 0.0;
        sb.append("\"cnywinprice\":").append(cnywinprice).append(",");

        //47.imei, Type.STRING,手机串码---faker生成
        String imei = fak.code().imei();
        sb.append("\"imei\":").append("\"").append(imei).append("\"").append(",");

        //48.mac, Type.STRING,手机MAC码---faker生成
        String mac = fak.internet().macAddress();
        sb.append("\"mac\":").append("\"").append(mac).append("\"").append(",");

        //49.idfa, Type.STRING,手机APP的广告码---uuid(小写)
        String idfa = DataUUID.getLowerUUID(fak);
        sb.append("\"idfa\":").append("\"").append(idfa).append("\"").append(",");

        //50.openudid, Type.STRING,苹果设备的识别码---uuid(大写)
        String openudid = DataUUID.getUpperUUID(fak);
        sb.append("\"openudid\":").append("\"").append(openudid).append("\"").append(",");

        //51.androidid, Type.STRING,安卓设备的识别码---""
        String androidid = "";
        sb.append("\"androidid\":").append("\"").append(androidid).append("\"").append(",");

        //52.rtbprovince, Type.STRING,rtb,省---""
        String rtbprovince = "";
        sb.append("\"rtbprovince\":").append("\"").append(rtbprovince).append("\"").append(",");

        //53.rtbcity, Type.STRING,rtb,市---""
        String rtbcity = "";
        sb.append("\"rtbcity\":").append("\"").append(rtbcity).append("\"").append(",");

        //54.rtbdistrict, Type.STRING,rtb,区---""
        String rtbdistrict = "";
        sb.append("\"rtbdistrict\":").append("\"").append(rtbdistrict).append("\"").append(",");

        //55.rtbstreet, Type.STRING,rtb,街道---""
        String rtbstreet = "";
        sb.append("\"rtbstreet\":").append("\"").append(rtbstreet).append("\"").append(",");

        //56.storeurl, Type.STRING,app的市场下载地址---""
        String storeurl = "";
        sb.append("\"storeurl\":").append("\"").append(storeurl).append("\"").append(",");

        //57.realip, Type.STRING,真实ip---ip生成
        String realip = IPData.getRandomIp();
        sb.append("\"realip\":").append("\"").append(realip).append("\"").append(",");

        //58.isqualityapp, Type.INT64,优选标识---0
        int isqualityapp = 0;
        sb.append("\"isqualityapp\":").append(isqualityapp).append(",");

        //59.bidfloor, Type.DOUBLE,底价---0.0
        double bidfloor = 0.0;
        sb.append("\"bidfloor\":").append(bidfloor).append(",");

        //60.aw, Type.INT64,广告位的宽---0
        int aw = 0;
        sb.append("\"aw\":").append(aw).append(",");

        //61.ah, Type.INT64,广告位的高---0
        int ah = 0;
        sb.append("\"ah\":").append(ah).append(",");

        //62.imeimd5, Type.STRING,imei_md5---""
        String imeimd5 = "";
        sb.append("\"imeimd5\":").append("\"").append(imeimd5).append("\"").append(",");

        //63.macmd5, Type.STRING,mac_md5---""
        String macmd5 = "";
        sb.append("\"macmd5\":").append("\"").append(macmd5).append("\"").append(",");

        //64.idfamd5, Type.STRING,idfa_md5---""
        String idfamd5 = "";
        sb.append("\"idfamd5\":").append("\"").append(idfamd5).append("\"").append(",");

        //65.openudidmd5, Type.STRING,苹果openudid_md5---""
        String openudidmd5 = "";
        sb.append("\"openudidmd5\":").append("\"").append(openudidmd5).append("\"").append(",");

        //66.androididmd5, Type.STRING,安卓androidid_md5---""
        String androididmd5 = "";
        sb.append("\"androididmd5\":").append("\"").append(androididmd5).append("\"").append(",");

        //67.imeisha1, Type.STRING,imei_sha1---""
        String imeisha1 = "";
        sb.append("\"imeisha1\":").append("\"").append(imeisha1).append("\"").append(",");

        //68.macsha1, Type.STRING,mac_sha1---""
        String macsha1 = "";
        sb.append("\"macsha1\":").append("\"").append(macsha1).append("\"").append(",");

        //69.idfasha1, Type.STRING,idfa_sha1---""
        String idfasha1 = "";
        sb.append("\"idfasha1\":").append("\"").append(idfasha1).append("\"").append(",");

        //70.openudidsha1, Type.STRING,openudid_sha1---""
        String openudidsha1 = "";
        sb.append("\"openudidsha1\":").append("\"").append(openudidsha1).append("\"").append(",");

        //71.androididsha1, Type.STRING,androidid_sha1---""
        String androididsha1 = "";
        sb.append("\"androididsha1\":").append("\"").append(androididsha1).append("\"").append(",");

        //72.uuidunknow, Type.STRING,uuid_unknow UUID密文---""
        String uuidunknow = "";
        sb.append("\"uuidunknow\":").append("\"").append(uuidunknow).append("\"").append(",");

        //73.userid, Type.STRING,平台用户id---uuid(小写)
        String userid = DataUUID.getLowerUUID(fak);
        sb.append("\"userid\":").append("\"").append(userid).append("\"").append(",");

        //74.reqdate---""
        String reqdate = "";
        sb.append("\"reqdate\":").append("\"").append(reqdate).append("\"").append(",");

        //75.reqhour---""
        String reqhour = "";
        sb.append("\"reqhour\":").append("\"").append(reqhour).append("\"").append(",");

        //76.iptype, Type.INT64，表示ip库类型，1为点媒ip库，2为广告协会的ip地理信息标准库，默认为1---{1百分之九十,2百分之十}
        int iptype = NumData.getMoreOne(DataRandom.getRandomInt(twoNumLength));
        sb.append("\"iptype\":").append(iptype).append(",");

        //77.initbidprice, Type.DOUBLE,初始出价---0.0
        double initbidprice = 0.0;
        sb.append("\"initbidprice\":").append(initbidprice).append(",");

        //78.adpayment, Type.DOUBLE,转换后的广告消费（保留小数点后6位）---{10000~200000]
        double adpayment = DataRandom.getRandomInt(190000, 10000);
        sb.append("\"adpayment\":").append(adpayment).append(",");

        //79.agentrate, Type.DOUBLE,代理商利润率---0.0
        double agentrate = 0.0;
        sb.append("\"agentrate\":").append(agentrate).append(",");

        //80.lomarkrate, Type.DOUBLE,代理利润率---0.0
        double lomarkrate = 0.0;
        sb.append("\"lomarkrate\":").append(lomarkrate).append(",");

        //81.adxrate, Type.DOUBLE,媒介利润率---0.0
        double adxrate = 0.0;
        sb.append("\"adxrate\":").append(adxrate).append(",");

        //82.title, Type.STRING,标题---句子100条
        String title = DataTitle.getTitle();
        sb.append("\"title\":").append("\"").append(title).append("\"").append(",");

        //83.keywords, Type.STRING,关键字---100条
        String keywords = DataKeyWords.getKeyWords();
        sb.append("\"keywords\":").append("\"").append(keywords).append("\"").append(",");

        //84.tagid, Type.STRING广告位标识(当视频流量时值为视频ID号)---uuid(大写)
        String tagid = DataUUID.getUpperUUID(fak);
        sb.append("\"tagid\":").append("\"").append(tagid).append("\"").append(",");

        //85.callbackdate, Type.STRING,回调时间,格式为:YYYY/mm/dd---当前时间
        String callbackdate = requestdate;
        sb.append("\"callbackdate\":").append("\"").append(callbackdate).append("\"").append(",");

        //86.channelid, Type.STRING	频道ID---
        String channelid = DataRandom.getRandomInt(300, 123400) + "";
        sb.append("\"channelid\":").append("\"").append(channelid).append("\"").append(",");

        //87.mediatype, Type.INT64	媒体类型---{1,2,3}
        int mediatype = DataRandom.getRandomInt(3, 1);
        sb.append("\"mediatype\":").append(mediatype).append(",");

        //89.tel, Type.STRING,用户电话号码---faker随机生成手机号
        String tel = fak.phoneNumber().cellPhone();

        //88.email, Type.STRING,用户email---faker随机生成邮箱
        String email = fak.internet().emailAddress(tel);
        sb.append("\"email\":").append("\"").append(email).append("\"").append(",");
        sb.append("\"tel\":").append("\"").append(tel).append("\"").append(",");


        //90.age, Type.STRING,用户年龄---[10,70]
        int age = DataRandom.getRandomInt(60, 10);
        sb.append("\"age\":").append("\"").append(age).append("\"").append(",");

        //91.sex, Type.STRING,用户性别---{0,1}
        int sex = DataRandom.getRandomInt(2);
        sb.append("\"sex\":").append("\"").append(sex).append("\"").append("}").append(lineSeparator);

        return sb.toString();
    }
}
