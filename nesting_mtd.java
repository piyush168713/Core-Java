class nesting{
    int m,n;
    nesting(int x, int y){         // constructor called
        m=x;
        n=y;
    }
    int largest(){
        if(m>=n)
            return (m);
        else
            return (n);
    }

    void display(){
        int large = largest();         // Calling a method
        System.out.println("Largest value = " + large);
    }
}

class nesting_mtd {
    public static void main(String[] args) {
        nesting n = new nesting(7, 8);
        n.display();
    }
}
