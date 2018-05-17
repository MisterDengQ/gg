package org.seckill.enums;

/**
 * 使用枚举表述常量数据字段
 * Created by Administrator on 2018/4/28.
 */
public enum SeckillStatEnum {
    SUCCESS(1,"秒杀成功"),
    END(0,"秒杀关闭"),
    REPEAT_KILL(-1,"重复秒杀"),
    INNER_ERROR(-2,"系统异常"),
    DATA_REWRITE(-3,"数据篡改");
    private int state;
    private String stateInfo;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    SeckillStatEnum(int state, String stateInfo) {

        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static SeckillStatEnum stateOf(int index) {
        for(SeckillStatEnum state:values()) {
            if(state.getState() == index) {
                return state;

            }
        }
    return null;
    }
}
