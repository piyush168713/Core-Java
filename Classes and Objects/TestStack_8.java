package com.company;// Improved stack class that uses the length array number.

class Stack{
    private int stck[];
    private int tos;

    // allocate and initialize stack
    Stack(int size){
        stck = new int [size];
        tos = -1;
    }

    // push an item onto the stack
    void push(int item){
        if (tos==stck.length-1)     // use length number
            System.out.println("com.company.Stack is full!");
        else
            stck[++tos] = item;
    }

    // pop an item from the stack
    int pop(){
        if(tos<0){
            System.out.println("com.company.Stack Underflow");
            return 0;
        }
        else
            return stck[tos--];
    }

}

public class TestStack_8 {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        Stack s2 = new Stack(8);

        // push some numbers onto the stack
        for (int i = 0; i<5; i++) s1.push(i);
        for (int i = 0; i<8; i++) s2.push(i);

        // pop those numbers off the stack
        System.out.println("com.company.Stack in s1: ");
        for (int i = 0; i<5; i++)
            System.out.println(s1.pop());

        System.out.println("\ncom.company.Stack in s2: ");
        for (int i = 0; i<8; i++)
            System.out.println(s2.pop());
    }
}


// Notice that the program creates two stacks: one five elements deep and the other eight elements deep.
// As you can see, the fact that arrays maintain their own length information makes it easy to create stacks of any size.



