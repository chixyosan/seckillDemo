package org.seckill.exception;

/**
 * 秒杀相关异常
 * @Authod zefeng
 * @Date 2017/8/2 0002 下午 21:53
 */
public class SeckillExcepion extends RuntimeException{
    public SeckillExcepion(String message) {
        super(message);
    }

    public SeckillExcepion(String message, Throwable cause) {
        super(message, cause);
    }
}
