package com.design_principles.interface_isolation;

public class Door implements FireProof,WaterProof{

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
