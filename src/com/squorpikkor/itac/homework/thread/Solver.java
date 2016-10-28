package com.squorpikkor.itac.homework.thread;

 // Created by SquorpikkoR on 28.10.2016.

public class Solver implements Runnable{
    private double solution;
    private String name;

    public double getSolution() {
        return solution;
    }

    public Solver(double d, String name) {
        solution = d;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " считает...");
        solution = 77 * 77 * 77 * 77;
    }
}
