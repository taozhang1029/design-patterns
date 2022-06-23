package com.kingsley.principles.p4_interface_isolation.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class BSafetyDoor implements AntiTheft, Waterproof {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
