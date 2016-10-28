package com.squorpikkor.itac.homework.filefinder;

// Created by SquorpikkoR on 27.10.2016.

import java.io.File;

public class FileFinder {
    public static void main(String[] args) throws InterruptedException {
        long sleepTime = 1000;
        //int count = 0;
        String path = System.getProperty("user.dir") + File.separator + "src"+ File.separator +
                "com"+ File.separator + "squorpikkor"+ File.separator + "itac"+ File.separator +
                "homework"+ File.separator + "filefinder";

        System.out.println(path);
        File f = new File(path);

        Thread thread = Thread.currentThread();

        int count = f.listFiles().length;

        while (true) {
            thread.sleep(sleepTime);
            /*System.out.println(count);
            count++;*/
            //System.out.println(f.listFiles().length);

            if (f.listFiles().length > count) {
                System.out.println("Файлов стало больше!..");
                count = f.listFiles().length;
            } else if (f.listFiles().length < count) {
                System.out.println("И куда подевался файл?..");
                count = f.listFiles().length;
            }
        }







    }
}
