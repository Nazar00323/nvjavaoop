package NazarV.lesson_51;

public class SimpleGen<P, T> {
    P obj;
    T otherObject;

    public SimpleGen(P obj, T otherObject) {
        this.obj = obj;
        this.otherObject = otherObject;
    }

    public P getObj() {
        return obj;
    }

    public T getOtherObject() {
        return otherObject;
    }

    public void showType() {
        System.out.println("Type of param P is " + obj.getClass().getName());
        System.out.println("Type of param T is " + otherObject.getClass().getName());
    }
}
