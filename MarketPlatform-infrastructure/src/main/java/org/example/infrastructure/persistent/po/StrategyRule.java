package org.example.infrastructure.persistent.po;

import javax.xml.crypto.Data;

public class StrategyRule {

    /*自增ID*/
    private Long id;
    /*抽奖策略ID*/
    private Long strategyId;
    /*抽奖奖品策略ID*/
    private Integer awardId;
    /*抽奖规则类型*/
    private Integer ruleType;
    /*策略规则*/
    private String ruleModel;
    /*抽奖规则比值*/
    private String ruleValue;
    /*抽奖规则描述*/
    private String ruleDesc;
    /*创建时间*/
    private Data createTime;
    /*更新时间*/
    private Data updateTime;
}
