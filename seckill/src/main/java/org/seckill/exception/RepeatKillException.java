package org.seckill.exception;

/**
 * 重复秒杀异常（属于运行期异常不用try catch）
 * Created by Administrator on 2018/4/28.
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepeatKillException(String message) {

        super(message);
    }
}
