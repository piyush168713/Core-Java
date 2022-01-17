class vehicle{
    protected String brand = "Nissan";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

public class Inheritance_4 extends vehicle {
    private String modelname = "GTR R-35";

    public static void main(String[] args) {
        Inheritance_4 x = new Inheritance_4();
        x.honk();

        System.out.println(x.brand + " " + x.modelname);
    }
}
