package com.company;

public class Main {
    static boolean foo (char a){
        System.out.println(a);
        return true;
    }

    public static void main(String[] args)throws Exception {
//        PrintThread printThread1= new PrintThread();
//        PrintThread printThread2=new PrintThread();
//        PrintThread printThread3= new PrintThread();
//        PrintThread printThread4=new PrintThread();
//        PrintThread printThread5= new PrintThread();
//        PrintThread printThread6= new PrintThread();
//        PrintThread printThread7= new PrintThread();
//        PrintThread printThread8= new PrintThread();
//        PrintThread printThread9=new PrintThread();
//        PrintThread printThread10= new PrintThread();
//        printThread1.init(1,printThread2);
//        printThread2.init(2,printThread3);
//        printThread3.init(3,printThread4);
//        printThread4.init(4,printThread5);
//        printThread5.init(5,printThread6);
//        printThread6.init(6,printThread7);
//        printThread7.init(7,printThread8);
//        printThread8.init(8,printThread9);
//        printThread9.init(9,printThread10);
//        printThread10.init(10,printThread1);
//        Thread thread1=new Thread(printThread1);
//        Thread thread2=new Thread(printThread2);
//        Thread thread3=new Thread(printThread3);
//        Thread thread4=new Thread(printThread4);
//        Thread thread5=new Thread(printThread5);
//        Thread thread6=new Thread(printThread6);
//        Thread thread7=new Thread(printThread7);
//        Thread thread8=new Thread(printThread8);
//        Thread thread9=new Thread(printThread9);
//        Thread thread10=new Thread(printThread10);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();
//        thread9.start();
//        thread10.start();
//        printThread1.start();
        int[] a=new int[]{1,2,3};
        int[] b=new int[]{2,3,4};
        int a1=0;
        for(int i=0;i<a.length;i++){
            a1+=a[i];
        }
        for(int i=0;i<b.length;i++){
            a1+=b[i];
        }
        int s=a1/2;
    }
}
