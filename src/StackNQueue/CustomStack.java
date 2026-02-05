package StackNQueue;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    /*[Note:
     Final Uses: 1. Value cannot be changed accidentally 2.Prevents runtime bugs.
     Static Uses: 1. Only one copy exists in memory 2. All CustomStack objects use the same default value.
     Private Uses: 1. Cannot be modified from outside the class 2. Prevents misuse like:
                                                                 CustomStack.DEFAULT_SIZE = 100;  not allowed]*/
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    //No-argument constructor : 1. Allows easy object creation. 2. Don’t have to think about size every time, i.e. Prevents uninitialized or zero-size stacks.


    public CustomStack(int size) {
        this.data = new int[size];
    }

    // Parameterized constructor: 1. Supports different use cases, i.e. Small stack → less memory,Large stack → avoid overflow.
    //                            2. Single source of initialization, i.e. All stack creation logic lives here, Both constructors eventually use this one.

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
