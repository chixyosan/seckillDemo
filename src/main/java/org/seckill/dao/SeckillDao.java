package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * @Authod zefeng
 * @Date 2017/7/31 0031 下午 21:01
 */
public interface SeckillDao {
    /**
     * @description 减库存
     * @authod zefeng
     * @Date 2017/7/31 0031 下午 21:08
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);
    /**
     * @description 根据ID查询商品
     * @authod zefeng
     * @Date 2017/7/31 0031 下午 21:08
     * @return
     */
    Seckill queryById(long seckillId);
    /**
     * @description 根据偏移量出查询秒杀商品列表
     * @authod zefeng
     * @Date 2017/7/31 0031 下午 21:09
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
