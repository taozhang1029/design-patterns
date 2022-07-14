package com.kingsley.principles.p5_demeter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZhangTao
 * @date 2022/7/14
 * @desc 经纪人类
 */
public class Agent {

    private Star star;

    private Company company;

    private List<Fans> fansList;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setFansList(List<Fans> fansList) {
        this.fansList = fansList;
    }

    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fansList.stream().map(Fans::getName).collect(Collectors.toList()) + "见面");
    }

    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
