package com.kingsley.principles.p3_dependency_reverse.after;

/**
 * @author ZhangTao
 * @date 2022/6/23
 * @desc
 */
public class Computer {

    private Cpu cpu;

    private Memory memory;

    private HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run() {
        System.out.println("运行计算机...");
        String data = hardDisk.read();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }

}
