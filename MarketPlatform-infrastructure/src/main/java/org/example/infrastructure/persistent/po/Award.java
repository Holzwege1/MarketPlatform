package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;
@Data
/*奖品表*/
public class Award {
    /*自增ID*/
    private long id;
    /*奖品ID*/
    private Integer awardId;
    /*策略标记*/
    private String awardKey;
    /*奖品配置*/
    private String awardConfig;
    /*奖品描述*/
    private String awardDesc;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;
}
