package Multithreaded_Progm;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        System.out.println("Thank You " + getName());
//        while (i<1000){
//            System.out.println("I am Thread");
//        }
    }
}

public class Thread_Priorities_5 {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Piyush1 (least Important)");
        Mythr1 t2 = new Mythr1("Piyush2");
        Mythr1 t3 = new Mythr1("Piyush3");
        Mythr1 t4 = new Mythr1("Piyush4");
        Mythr1 t5 = new Mythr1("Piyush5 (most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
