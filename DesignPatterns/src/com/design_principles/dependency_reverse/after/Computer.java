package com.design_principles.dependency_reverse.after;

public class Computer {
    //定义的是接口对象
    private HardDisk hardDisk;
    private CPU cpu;
    private Memory memory;

    public void run(){
        System.out.println("计算机运行");
        String data = hardDisk.get();
        System.out.println("获得的数据" + data);
        cpu.run();
        memory.save();
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
