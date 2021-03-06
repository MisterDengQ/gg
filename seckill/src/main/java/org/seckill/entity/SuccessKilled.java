package org.seckill.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/23.
 */
public class SuccessKilled {
    private long seckillId;
    private long userPhone;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    private int state;

    //多对一
    private Seckill seckill;
    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" + "seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state + ", createTime=" + createTime + '}';
    }

    private Date createTime;
}
