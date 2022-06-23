package com.kingsley.principles.p3_dependency_reverse.before;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class Computer {

    private XijieHardDisk hardDisk;

    private IntelCpu cpu;

    private KingstonMemory memory;

    public XijieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XijieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机...");
        String data = hardDisk.read();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}
