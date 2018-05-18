package com.company;

public class ShopingThread extends Thread {

    private Object object;
    private  int max=100;
    private ShopingThread(Object object,int number){
        this.object=object;
    }
    private volatile int number=0;

    @Override
    public  void run() {
        synchronized (object){
            try {
                    System.out.println("======"+Thread.currentThread().getName()+this.object+"");
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    object.wait();

            }catch (InterruptedException e){

            }


        }
    }
    public static void main(String[] args){
        Object object=new Object();
        int  n=0;
//        for(int i=0;i<10;i++){
            ShopingThread shopingThread=new ShopingThread(object,n);
            shopingThread.start();
//        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
        ShopingThread shopingThread2=new ShopingThread(object,n);
        shopingThread2.start();
//        synchronized (object){
//            object.notify();
//        }
    }
}
