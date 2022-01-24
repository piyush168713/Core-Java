package Multithreaded_Progm;

class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while (i<30000){
            System.out.println("My Thread1 is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while (i<30000){
            System.out.println("My Thread2 is good");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class Extending_Thread_1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}







//class NewThread extends Thread{
//
//    NewThread() {
//        // creates a new, second class
//        super("Demo Thread");
//        System.out.println("child thread: " + this);
//        start();
//    }
//
//    // this is the entry point of second thread.
//    public void run(){
//        try {
//            for (int i = 5; i>0; i--){
//                System.out.println("Child Thread: " + i);
//                Thread.sleep(500);
//            }
//        }catch (InterruptedException e){
//            System.out.println("Child Interrupted.");
//        }
//        System.out.println("Existing child thread.");
//    }
//}
//
//class Extending_Thread_1{
//    public static void main(String[] args) {
//        new Thread();   // creates a new thread
//
//        try {
//            for (int i = 5; i>0; i--){
//                System.out.println("Main Thread: " + i);
//                Thread.sleep(1000);
//            }
//        }catch (InterruptedException e){
//            System.out.println("Main Thread Interrupted");
//        }
//        System.out.println("Main Thread Existing");
//    }
//}