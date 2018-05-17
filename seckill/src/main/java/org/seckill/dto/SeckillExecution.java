package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * 封装秒执行后的结果
 * Created by Administrator on 2018/4/28.
 */
public class SeckillExecution {
    private long seckillId;

    //秒杀执行结果状态
    private int state;

    //状态表示
    private String stateinfo;
    //秒杀成功对象

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" + "seckillId=" + seckillId + ", state=" + state + ", stateinfo='" + stateinfo + '\'' + ", successKilled=" + successKilled + '}';
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateinfo() {
        return stateinfo;
    }

    public void setStateinfo(String stateinfo) {
        this.stateinfo = stateinfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckillId,  SeckillStatEnum seckillStatEnum) {

        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateinfo = seckillStatEnum.getStateInfo();
    }

    public SeckillExecution(long seckillId, SeckillStatEnum seckillStatEnum, SuccessKilled successKilled) {

        this.seckillId = seckillId;
        this.state = seckillStatEnum.getState();
        this.stateinfo = seckillStatEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    private SuccessKilled successKilled;
}
