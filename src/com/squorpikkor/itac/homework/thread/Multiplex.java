package com.squorpikkor.itac.homework.thread;

 // Created by SquorpikkoR on 28.10.2016.

public class Multiplex {
    public static void main(String[] args) throws InterruptedException {
        double formula1 = 2 + 2 * 2;
        double formula2 = 12 - 8;
        double formula3 = 12 - 8;

        Solver s1 = new Solver(formula1, "s1");
        Solver s2 = new Solver(formula2, "s2");

        Thread tr1 = new Thread(s1);
        Thread tr2 = new Thread(s2);

        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();

        System.out.println(s1.getSolution() * s2.getSolution());
    }

}
