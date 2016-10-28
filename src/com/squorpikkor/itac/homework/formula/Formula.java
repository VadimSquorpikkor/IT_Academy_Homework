package com.squorpikkor.itac.homework.formula;

 //Created by SquorpikkoR on 28.10.2016.

public class Formula implements Runnable{

    private double answer;

    public double getAnswer() {
        return answer;
    }

    @Override
    public void run() {
        answer = (3 * 5)+(6 * 9);

    }
}
