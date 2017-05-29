package NazarV.lesson_51;


public interface IStack {
    void push(int item);

    int pop();

    int top();

    boolean isEmpty();

    boolean isFull();
}
