package com.company;

import java.util.List;

public class PrintThread implements Runnable {

    public static int i=1;
    public static boolean over=false;
    public boolean flag=false;
    public  int num;
    public PrintThread printThread;
    public void init(int num, PrintThread printThread){
        this.num=num;
        this.printThread=printThread;
    }
    public void start(){
        flag=true;
    }
    @Override
    public void run() {
            while (true) {
                synchronized (this){
                    if(over){
                        break;
                    }
                if (flag) {
                    if (PrintThread.i <= 100) {
                        System.out.println("线程：" + this.num + "=====" + PrintThread.i);
                        PrintThread.i++;
                    }else{
                        over=true;
                    }
                    end();
                    printThread.start();
                }
            }

        }
    }
    public void end(){
        flag=false;
    }
}
