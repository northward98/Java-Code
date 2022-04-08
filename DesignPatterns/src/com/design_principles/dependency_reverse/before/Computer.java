package com.design_principles.dependency_reverse.before;

public class Computer {
    private Disk disk;
    private Cpu cpu;
    private Memory memory;

    public void run(){
        System.out.println("计算机运行");
        String data = disk.get();
        System.out.println("获得的数据" + data);
        cpu.run();
        memory.save();
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

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
}
