package com.sigis.abs;

public abstract class Animal {

    public String name;
    public int numLegs;

    public abstract void emitNoise();

    public static void generalNoise() {
        System.out.println("General Noise ..... ");
    }

}
