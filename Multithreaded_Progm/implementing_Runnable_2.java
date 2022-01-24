package Multithreaded_Progm;

class MyrunnableThread1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<30000){
            System.out.println("I am Thread 1 not a Thread 1");
            i++;
        }
    }
}

class MyrunnableThread2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<30000){
            System.out.println("I am Thread 2 not a Thread 2");
            i++;
        }
    }
}

public class implementing_Runnable_2 {
    public static void main(String[] args) {
        MyrunnableThread1 bullet1 = new MyrunnableThread1();
        Thread gun1 = new Thread(bullet1);

        MyrunnableThread2 bullet2 = new MyrunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
