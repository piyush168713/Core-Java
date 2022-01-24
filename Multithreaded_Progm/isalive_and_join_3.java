package Multithreaded_Progm;

class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run(){
        try{
            for (int i = 5; i>0; i--){
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " existing");
    }
}

public class isalive_and_join_3 {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");
        NewThread obj3 = new NewThread("Three");

        System.out.println("Thread one is alive: " + obj1.t.isAlive());
        System.out.println("Thread two is alive: " + obj2.t.isAlive());
        System.out.println("Thread three is alive: " + obj3.t.isAlive());
        // wait for thread to finish

        try{
            System.out.println("Waiting foe thread to finish.");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Thread one is alive: " + obj1.t.isAlive());
        System.out.println("Thread two is alive: " + obj2.t.isAlive());
        System.out.println("Thread three is alive: " + obj3.t.isAlive());
        System.out.println("Main thread existing");
        System.out.println("Bye");
    }
}
