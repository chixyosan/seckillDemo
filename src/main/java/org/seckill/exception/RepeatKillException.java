package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 * @Authod zefeng
 * @Date 2017/8/2 0002 下午 21:49
 */
public class RepeatKillException extends SeckillExcepion{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
