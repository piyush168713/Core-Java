//class mathoperation{
//    static float mul(float x, float y){
//        return x*y;
//    }
//    static float divide(float x, float y){
//        return x/y;
//    }
//}
//
//class static_mem {
//    public static void main(String[] args) {
//        float a = mathoperation.mul(5,4);
//        float b = mathoperation.divide(20,4);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//    }
//}

// A static method means that it can be accessed without creating an object of the class, unlike public:


public class static_mem_1 {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void show() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[ ] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        static_mem_1 myObj = new static_mem_1(); // Create an object of Main
        myObj.show(); // Call the public method
    }
}