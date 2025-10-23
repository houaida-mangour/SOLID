package com.directi.training.lsp.exercise_refactored;


public class Pool {
    public void run() {
        Duck naturalDuck = new NaturalDuck();
        Duck electronicDuck = new ElectronicDuck(); // Still polymorphic

        quack(naturalDuck, electronicDuck);
        swim(naturalDuck, electronicDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack(); 
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim(); 
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}