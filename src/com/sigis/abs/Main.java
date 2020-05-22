package com.sigis.abs;

public class Main {

    public static void main(String[] args) {

        // Animal animal = new Animal();
        Animal animalCat = new Cat();
        Animal animalDog = new Dog();

        // animal.emitNoise();
        animalCat.emitNoise();
        animalDog.emitNoise();

        animalCat.generalNoise();

    }
}
