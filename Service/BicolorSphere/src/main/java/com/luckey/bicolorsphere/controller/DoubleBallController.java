package com.luckey.bicolorsphere.controller;/**
 * @auther chen
 * @date 2022-10-03 14:44
 */

import com.luckey.bicolorsphere.service.DoubleBallService;
import com.luckey.commonutil.DO.Doubleball;
import com.luckey.commonutil.util.JsoupUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-03 14:44
 **/
@RestController
@RequestMapping("/doubleball")
public class DoubleBallController {
    @Autowired
    private DoubleBallService doubleBallService;

    @GetMapping("/helloworld")
    public String helloworld() throws IOException {
        return "helloworld";
    }

    @GetMapping("/addDoubleBall")
    public String addDoubleBall() throws IOException {
        List<Doubleball> list= JsoupUtils.getNewYearHistory("2021");
        doubleBallService.addDoubleBalls(list);
        return "";
    }
}
