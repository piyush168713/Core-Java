package Enumerations_Autoboxing_Annotations_12;

// enum define a class gives the Java enumeration extraordinary power.
// example - you can give them constructors, add instances variables and methods, and even implements interfaces.
// each enumeration constant is an object of its enumeration type.

enum Friends1{
    Piyush(10), Ashish(13), Yogesh(15), Harsh(9), Vishal(16);
//    Piyush, Ashish, Yogesh, Harsh, Vishal;

    private int price;

    Friends1(int p){       // constructor
        price = p;
    }

//    Friends1(){     // default constructor is called, that initializes the price to -1, to indicate that no price data is available.
//        price = -1;      // overloaded constructor
//    }

    int getPrice(){
        return price;
    }
}

public class enum_class_2 {
    public static void main(String[] args) {

        // Display price
        System.out.println("Ashish costs " + Friends1.Ashish.getPrice() + " dollar.\n");

        // Display all prices
        System.out.println("All friends prices: ");
        for (Friends1 f : Friends1.values())
            System.out.println(f + " costs " + f.getPrice() + " dollar.");
    }
}
