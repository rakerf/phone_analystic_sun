/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: uaTest
 * Author:   Chenfg
 * Date:     2020/4/15 0015 16:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sun.bigdata.phone.analystic;

import com.sun.bigdata.phone.analystic.etl.userAgentUtil;

/**
 *
 * @author Chenfg
 * @create 2020/4/15 0015
 * @since 1.0.0
 */
public class uaTest {
    public static void main(String[] args) {
        System.out.println(userAgentUtil.parserUserAgent("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Win64; x64; Trident/4.0; .NET CLR 2.0.50727; SLCC2; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)"));
        System.out.println(userAgentUtil.parserUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3314.0 Safari/537.36 SE 2.X MetaSr 1.0"));
        System.out.println(userAgentUtil.parserUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Safari/537.36"));
    }
}
