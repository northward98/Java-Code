package com.design_principles.interface_isolation;

public class Test {
    public static void main(String[] args) {
        Door door = new Door();
        door.fireProof();
        door.waterProof();
    }
}
