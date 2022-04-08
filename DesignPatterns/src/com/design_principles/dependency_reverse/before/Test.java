package com.design_principles.dependency_reverse.before;

public class Test {
    public static void main(String[] args) {
        //组件对象
        Disk disk = new Disk();
        Cpu cpu = new Cpu();
        Memory memory = new Memory();
        //计算机对象
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setDisk(disk);
        computer.setMemory(memory);
        //运行
        computer.run();
    }
}
