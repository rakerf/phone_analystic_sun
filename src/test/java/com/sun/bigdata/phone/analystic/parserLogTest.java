/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: parserLogTest
 * Author:   Chenfg
 * Date:     2020/4/16 0016 11:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sun.bigdata.phone.analystic;

import com.sun.bigdata.phone.analystic.etl.LogUtil;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Chenfg
 * @create 2020/4/16 0016
 * @since 1.0.0
 */
public class parserLogTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(LogUtil.parserLog("119.31.192.11^A1535530827.901^A119.31.192.11^A/qf.png?en=e_l&ver=1&pl=website&sdk=js&u_ud=0DCFADBE-375A-4AED-AF7C-C95A7FE975B4&u_sd=AD5BCC19-2067-4E22-B163-CC8EA8DAF0D4&c_time=1535616633889&b_iev=Mozilla%2F4.0%20(compatible%3B%20MSIE%208.0%3B%20Windows%20NT%206.1%3B%20Win64%3B%20x64%3B%20Trident%2F4.0%3B%20.NET%20CLR%202.0.50727%3B%20SLCC2%3B%20.NET%20CLR%203.5.30729%3B%20.NET%20CLR%203.0.30729%3B%20Media%20Center%20PC%206.0%3B%20.NET4.0C%3B%20.NET4.0E)&b_rst=1600*900"));
    }
}
