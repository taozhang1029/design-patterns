package com.kingsley.principles.p5_demeter;

import java.util.Collections;
import java.util.List;

/**
 * @author ZhangTao
 * @date 2022/7/14
 * @desc 明星人
 */
public class DemeterClient {

    public static void main(String[] args) {
        Agent agent = new Agent();
        Company company = new Company("佳琪音乐");
        agent.setCompany(company);

        List<Fans> fans = Collections.singletonList(new Fans("zzzzt"));
        agent.setFansList(fans);

        Star star = new Star("zzzjq");
        agent.setStar(star);

        agent.meeting();
        agent.business();
    }

}
