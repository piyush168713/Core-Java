package com.company;
class outer{
    int outer_x = 100;

    void test(){
        inner in = new inner();
        in.display();
    }
    class inner{
        void display(){
            System.out.println("Display: outer_x = " + outer_x);
        }
    }
}

public class Nested_cls_9 {
    public static void main(String[] args) {
        outer ou = new outer();
        ou.test();
    }
}







//class outer{
//    int outer_x = 100;
//
//    void test(){
//        for (int i = 0; i<10; i++){
//            class inner{
//                void display(){
//                    System.out.println("Display: outer_x: " + outer_x);
//                }
//            }
//            inner in = new inner();
//            in.display();
//        }
//    }
//}
//
//class Nested_cls_9{
//    public static void main(String[] args) {
//        outer ou = new outer();
//        ou.test();
//    }
//}
