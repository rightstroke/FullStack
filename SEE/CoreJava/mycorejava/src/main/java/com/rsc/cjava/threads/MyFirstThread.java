package com.rsc.cjava.threads;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MyFirstThread extends Thread {

    public static Map<String,String> hmStatus = new HashMap<>();

    @Override
    public void run (){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
        System.out.println("My-" + this.getName() + "-Thread is running");
        hmStatus.put(this.getName(),Calendar.getInstance().toString());
    }

    public static void main(String[] args) {
        MyFirstThread myThrd1 = new MyFirstThread();
        myThrd1.setName("MyAppThread1");
        myThrd1.setPriority(2);
        myThrd1.start();

        MyFirstThread myThrd2 = new MyFirstThread();
        myThrd2.setName("MyAppThread2");
        myThrd2.setPriority(3);
        myThrd2.start();

        try {
            myThrd1.join();
            myThrd2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("The OP is...");
        System.out.println(MyFirstThread.hmStatus);
    }
}