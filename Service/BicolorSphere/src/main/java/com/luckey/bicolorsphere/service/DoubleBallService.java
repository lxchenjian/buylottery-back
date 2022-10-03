package com.luckey.bicolorsphere.service;/**
 * @auther chen
 * @date 2022-10-03 15:12
 */

import com.luckey.commonutil.DO.Doubleball;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-03 15:12
 **/
public interface DoubleBallService {

    public void addDoubleBalls(List<Doubleball> list);
}
