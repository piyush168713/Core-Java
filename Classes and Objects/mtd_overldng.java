class Room{
    float length;
    float breadth;

    Room(float x, float y){
        length = x;
        breadth = y;
    }
    Room(float x){
        length = breadth = x;
    }
    void display(){
        float area;
        area = length * breadth;
        System.out.println("Area is: " + area);
    }
}

class mtd_overldng {
    public static void main(String[] args) {
        Room r1 = new Room(15,10);
        Room r2 = new Room(6);
        r1.display();
        r2.display();
    }
}
