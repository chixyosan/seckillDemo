package org.seckill.sevice;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillExcepion;

import java.util.List;

/**
 * 业务接口：方法定义粒度；参数，返回类型（return 类型/异常）
 * @Authod zefeng
 * @Date 2017/8/2 0002 下午 21:25
 */
public interface SeckillService {

    /**
     * @description 查询所有秒杀记录
     * @authod zefeng
     * @Date 2017/8/2 0002 下午 21:31
     * @return 
     */
    List<Seckill> getSeckillList();

    /**
     * @description 查询单个秒杀记录
     * @authod zefeng
     * @Date 2017/8/2 0002 下午 21:32
     * @return 
     */
    Seckill getById(long seckillId);

    /**
     * @description 秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
     * @authod zefeng
     * @Date 2017/8/2 0002 下午 21:34
     * @return 
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * @description 执行秒杀操作
     * @authod zefeng
     * @Date 2017/8/2 0002 下午 21:43
     * @return 
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillExcepion,RepeatKillException,SeckillCloseException;
}
