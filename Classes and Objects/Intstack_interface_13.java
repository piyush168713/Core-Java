package com.company;

// Implement a "growable" stack.
class DynStack implements IntStack {
    private int stamck[];
    private int tosm;

// allocate and initialize stack
    DynStack(int size){
        stamck = new int[size];
        tosm = -1;
    }

    // push an item onto the stack
    public void push(int item){
        // if stack is full, allocate a larger stack.
        if (tosm == stamck.length-1){
            int temp[] = new int[stamck.length*2];  // double size
            for (int i=0; i <stamck.length; i++) temp[i] = stamck[i];
            stamck = temp;
            stamck[++tosm] = item;
        }
        else
            stamck[++tosm] = item;
    }

    // pop an item from the stack
    public int pop(){
        if (tosm<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stamck[tosm--];
    }
}

class Intstack_interface_13 {
    public static void main(String[] args) {
        DynStack obj1 = new DynStack(5);
        DynStack obj2 = new DynStack(8);

        // these loops cause each stack to grow
        for (int i = 0; i<12; i++) obj1.push(i);
        for (int i = 0; i<20; i++) obj2.push(i);

        System.out.println("Stack in obj1: ");
        for (int i = 0; i<12; i++)
            System.out.println(obj1.pop());

        System.out.println("Stack in obj2: ");
        for (int i = 0; i<20; i++)
            System.out.println(obj2.pop());
    }
}
