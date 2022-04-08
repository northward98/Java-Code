package com.design_principles.dependency_reverse.after;

public class Test {
    public static void main(String[] args) {
        //组件对象
        HardDisk hardDisk = new Disk();
        CPU cpu = new IntelCpu();
        Memory memory = new KingstonMemory();
        //计算机对象
        Computer computer = new Computer();
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);
        //运行计算机
        computer.run();
    }
}
