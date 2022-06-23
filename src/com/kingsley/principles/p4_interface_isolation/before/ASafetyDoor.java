package com.kingsley.principles.p4_interface_isolation.before;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class ASafetyDoor implements SafetyDoor {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
