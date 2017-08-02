package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @Authod zefeng
 * @Date 2017/8/2 0002 下午 21:52
 */
public class SeckillCloseException extends SeckillExcepion{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
