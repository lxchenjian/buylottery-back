package com.luckey.commonutil.util;/**
 * @auther chen
 * @date 2022-10-03 12:24
 */

import com.luckey.commonutil.DO.Doubleball;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-03 12:24
 **/
public class JsoupUtils {


    public static void main(String[] args) throws IOException {
    }

    public static List<Doubleball> getNewYearHistory(String year)  {
        List<Doubleball> list = new ArrayList<Doubleball>();
        int i=1;
        boolean a=true;
        String url_front="http://kaijiang.500.com/shtml/ssq/";
        String url_back=".shtml";
        while(true){
            System.out.println(i);
            String url = url_front+year.substring(2)+String.format("%03d",i)+url_back;
            String html = null;
            html = JsoupUtils.getHtml(url);
            if(html == null) break;
            Document doc = JsoupUtils.ParseHTML(html);
            if(doc.getElementsByClass("ball_red").text().split(" ")[0].length()>2) {
                break;
            }
            String[] red = doc.getElementsByClass("ball_red").text().split(" ");
            String[] blue = doc.getElementsByClass("ball_blue").text().split(" ");
            Doubleball doubleball = new Doubleball();
            doubleball.setAccDate(year.substring(2)+String.format("%03d",i));
            doubleball.setRedBallOne(red[0]);
            doubleball.setRedBallTwo(red[1]);
            doubleball.setRedBallThree(red[2]);
            doubleball.setRedBallFour(red[3]);
            doubleball.setRedBallFive(red[4]);
            doubleball.setBlueBallOne(blue[0]);
            list.add(doubleball);
            i++;
        }
        return list;
    }



    /***
     * * 得到html
     * @param pageUrl
     * @return
     * @throws IOException
     */
    public static String getHtml(String pageUrl)  {
        //html()方法返回元素的 HTML；
        String html = null;
        try {
            html = Jsoup.connect(pageUrl).get().html();
        } catch (IOException e) {
        }
        return html;
    }

    public static Document ParseHTML(String html){
        //解析 HTML 数据，使用Jsoup的parse()方法，解析 HTML 字符串。 该方法返回一个 HTML 文档
        Document doc = Jsoup.parse(html);
        return doc;
    }


}
