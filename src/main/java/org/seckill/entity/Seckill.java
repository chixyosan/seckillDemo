package org.seckill.entity;

import java.util.Date;

/**
 * @Authod zefeng
 * @Date 2017/7/31 0031 下午 21:00
 */
public class Seckill {
    private long seckillId;
    private String naem;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    public long getSeckillId() {
        return seckillId;
    }
    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }
    public String getNaem() {
        return naem;
    }
    public void setNaem(String naem) {
        this.naem = naem;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Override
    public String toString() {
        return "Seckill [seckillId=" + seckillId + ", naem=" + naem
                + ", number=" + number + ", startTime=" + startTime
                + ", endTime=" + endTime + ", createTime=" + createTime + "]";
    }
}
