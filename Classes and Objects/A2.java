class A1 {
    int length, width;

    A1(int x, int y) {
        length = x;
        width = y;
    }

    int rectarea() {
        return length * width;
    }
}

class A2 {
    public static void main(String[] args) {
        A1 rect1 = new A1(20, 10);
        int area1 = rect1.rectarea();
        System.out.println("Area1 = " + area1);
    }
}
