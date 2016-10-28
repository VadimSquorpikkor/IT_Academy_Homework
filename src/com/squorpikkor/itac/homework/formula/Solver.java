package com.squorpikkor.itac.homework.formula;

// Created by SquorpikkoR on 28.10.2016.

public class Solver {
    public static void main(String[] args) throws InterruptedException {

        Formula f1 = new Formula();
        Formula f2 = new Formula();

        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(f1.getAnswer() * f2.getAnswer());

    }

}
