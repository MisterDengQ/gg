package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/4/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccesKilledDaoTest {
    @Resource
    SuccesKilledDao succesKilledDao;
    @Test
    public void insertSuccessKilled() throws Exception {

        long seckillId = 1001L;
        long userPhone = 18825146404L;
        int insertCount = succesKilledDao.insertSuccessKilled(seckillId,userPhone);
        System.out.println("insertCount="+insertCount);

    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        SuccessKilled successKilled = succesKilledDao.queryByIdWithSeckill(1001L,18825146404L);
        System.out.println("successKilled=" + successKilled);
        System.out.println("successKilled.getSeckill()=" + successKilled.getSeckill());

    }

}