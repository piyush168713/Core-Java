package Multithreaded_Progm;

class MyNewthr1 extends Thread{
    public void run(){
//        int i = 0;
        while (true){
        System.out.println("Thank You ");
            try {
                Thread.sleep(455);       // sleep() stops the program for 455 miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            System.out.println("I am Thread");
        }
    }
}
class MyNewthr2 extends Thread{
    public void run(){
//        int i = 0;
        while (true){
            System.out.println("My name is piyush: ");
//            System.out.println("I am Thread");
        }
    }
}

public class Thread_mtd_7 {
    public static void main(String[] args) {
        MyNewthr1 t1 = new MyNewthr1();
        MyNewthr2 t2 = new MyNewthr2();
        t1.start();

//        try{
//            t1.join();
//        } catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();




    }
}
