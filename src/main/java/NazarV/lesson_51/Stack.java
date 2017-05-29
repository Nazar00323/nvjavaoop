package NazarV.lesson_51;

import java.util.ArrayList;

public class Stack<TYPE> {
    private int size;
    private ArrayList<TYPE> elementsHolder;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.elementsHolder = new ArrayList<TYPE>(size);
        this.top = -1;
    }

    public void push(TYPE item) {
        elementsHolder.add(item);
        top++;
    }

    public TYPE pop() {
        TYPE tempObj;
        tempObj = top();
        elementsHolder.remove(top--);
        return tempObj;
    }

    public TYPE top() {
        return elementsHolder.get(top);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean isFull() {
        return (top >= size - 1);
    }

    public void showStack() {
        System.out.println("STACK TOP");
        for (int i = top; i >0 ; i--) {
            System.out.println("[" + elementsHolder.get(i) + "]");
        }
        System.out.println("STACK BOTTOM");
    }
}
