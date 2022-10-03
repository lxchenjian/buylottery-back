package com.luckey.bicolorsphere.service.impl;/**
 * @auther chen
 * @date 2022-10-03 15:15
 */

import com.luckey.bicolorsphere.mapper.DoubleBallMapper;
import com.luckey.bicolorsphere.service.DoubleBallService;
import com.luckey.commonutil.DO.Doubleball;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-03 15:15
 **/
@Service
public class DoubleBallServiceImpl implements DoubleBallService {
    @Autowired
    private DoubleBallMapper doubleBallMapper;

    @Override
    public void addDoubleBalls(List<Doubleball> list) {
        for(Doubleball temp:list){
            doubleBallMapper.addDoubleBalls(temp);
        }
    }
}
