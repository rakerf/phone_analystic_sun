/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ipTest
 * Author:   Chenfg
 * Date:     2020/4/15 0015 15:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sun.bigdata.phone.analystic;

import com.sun.bigdata.phone.analystic.etl.IPUtil;
import com.sun.bigdata.phone.analystic.etl.ip.IPSeeker;

/**
 *
 * @author Chenfg
 * @create 2020/4/15 0015
 * @since 1.0.0
 */
public class ipTest {
    public static void main(String[] args) {
//        System.out.println(IPSeeker.getInstance().getCountry("58.59.132.227"));
//        System.out.println(IPSeeker.getInstance().getArea("58.59.132.227"));
//        System.out.println(IPUtil.getRegionInfoByIP("58.59.132.227"));

        try {
            System.out.println(IPUtil.parserIp1("http://ip.taobao.com/service/getIpInfo.php?ip=58.59.132.227","utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
