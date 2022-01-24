package Multithreaded_Progm;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
//        int i = 0;
        System.out.println("Thank You");
//        while (i<1000){
//            System.out.println("I am Thread");
//        }
    }
}


public class Thread_Constructor_4 {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("piyush");
        t1.start();
        System.out.println("The id of the Thread t1 is: " + t1.getId());
        System.out.println("The name of the Thread t1 is: " + t1.getName());
        System.out.println("The priority of the Thread t1 is: " + t1.getPriority());
    }

}
