package com.kingsley.principles.p3_dependency_reverse.before;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class ComputerDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHardDisk(new XijieHardDisk());
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());
        computer.run();
    }

}
