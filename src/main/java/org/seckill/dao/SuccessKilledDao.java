package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * @Authod zefeng
 * @Date 2017/7/31 0031 下午 21:01
 */
public interface SuccessKilledDao {
    /**
     * @description 插入购买明细
     * @authod zefeng
     * @Date 2017/7/31 0031 下午 21:10
     * @return 
     */
    int insertSuccessKilled(long seckillId,long userPhone);
    /**
     * @description
     * @authod zefeng
     * @Date 2017/7/31 0031 下午 21:31
     * @return 
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
