class perimeter{
    int length, breadth;


perimeter(){
    length = 0;
    breadth = 0;
}

perimeter(int x, int y){
    length = x;
    breadth = y;
}

void cal_perimeter(){
    int peri;

    peri = 2 * (length + breadth);
    System.out.println("The perimeter of rectangle is: " + peri);
}
}

public class default_const_0 {
    public static void main(String[] args) {
        perimeter p1 = new perimeter();
        perimeter p2 = new perimeter(5,10);
        p1.cal_perimeter();
        p2.cal_perimeter();
    }
}
