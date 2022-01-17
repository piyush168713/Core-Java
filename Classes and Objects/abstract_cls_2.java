//An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

abstract class scl{
    String fname = "Piyush";
    int age = 20;
    abstract void study();      // abstract mtd
}

// subclass (inherits from main)
class student extends scl{
    int graduationyear = 2024;
    public void study(){
        System.out.println("Studying all the day");
    }
}

class abstract_cls_2{
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println("Name: " + s1.fname);
        System.out.println("Age: " + s1.age);
        System.out.println("Graduation year: " + s1.graduationyear);
        s1.study();      // call abstract mtd
    }
}