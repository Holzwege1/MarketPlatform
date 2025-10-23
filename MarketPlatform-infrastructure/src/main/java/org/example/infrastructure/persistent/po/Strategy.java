package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/*
* 抽奖策略
*
* */
@Data
public class Strategy {
    /*抽奖策略ID*/
    private long id;
    /*抽奖策略描述*/
    private long strategyId;
    /*策略模型*/
    private String strategyDesc;
    /*规则模型*/
    private String ruleModels;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updatTime;

}


