package com.luckey.bicolorsphere.mapper;/**
 * @auther chen
 * @date 2022-10-03 15:15
 */


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luckey.commonutil.DO.Doubleball;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-03 15:15
 **/
@Mapper
public interface DoubleBallMapper extends BaseMapper<Doubleball> {

    public void addDoubleBalls(@Param("doubleball") Doubleball doubleball);
}
