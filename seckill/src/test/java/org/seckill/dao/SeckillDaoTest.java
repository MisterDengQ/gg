package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/4/26.
 */

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入dao实现依赖
    @Resource
    private SeckillDao seckillDao;
    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int update = seckillDao.reduceNumber(1000L,killTime);
        System.out.println("update="+update);
    }

    @Test
    public void queryById() throws Exception {

        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryByAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryByAll(0,100);
        for(Seckill seckill: seckills) {
            System.out.println(seckill);

        }
    }

}