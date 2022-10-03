package com.luckey.commonutil.util;/**
 * @auther chen
 * @date 2022-10-02 18:50
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-02 18:50
 **/
public class ReptileUtils {
    private URL url;
    private InputStream is;
    private BufferedReader br;

    public static void main(String[] args) throws IOException {
        //方案一
        List<String> list = new ReptileUtils("http://kaijiang.500.com/shtml/ssq/22113.shtml?0_ala_baidu")
                .getUrlByUrlRegex("<li class=\"ball_red\">.*</li>");
        List<String> list2 = new ReptileUtils("http://kaijiang.500.com/shtml/ssq/22113.shtml?0_ala_baidu")
                .getUrlByUrlRegex("<li class=\"ball_blue\">.*</li>");
        list.forEach(o->{
            System.out.println(o);
        });

        list2.forEach(o->{
            System.out.println(o);
        });
    }


    public ReptileUtils(String pageUrl) throws IOException {
        //不是jsoup
        url = new URL(pageUrl);
        is = url.openStream();
        //GBK  UTF-8
        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
    }


    public List<String> getUrlByUrlRegex(String urlRegex) throws IOException {
        //   src="(.*?\.mp4)
        String info = "";
        List<String> list =new ArrayList<String>();
        ////我设置为网页的一共有 3000 行 具体根据 你获取网页行数的大小来决定
        for (int i = 0; i < 3000; i++) {
            info = br.readLine();
            if (null != info) {
                //正则表达式
                Pattern pattern = Pattern.compile(urlRegex);
                Matcher matcher = pattern.matcher(info);
                //比对成功
                if (matcher.find()) {
                    for (int j = 0; j <= matcher.groupCount(); j++) {
                        String tmp = matcher.group(j);
                        list.add(tmp);
                    }
                }
            }
        }
        return list;
    }

}
