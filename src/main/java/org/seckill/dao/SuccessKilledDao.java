package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
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
    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
    /**
     * @description
     * @authod zefeng
     * @Date 2017/7/31 0031 下午 21:31
     * @return 
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
