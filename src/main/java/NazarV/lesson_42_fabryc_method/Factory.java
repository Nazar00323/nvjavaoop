package NazarV.lesson_42_fabryc_method;

public class Factory {
    public static Service serviceRun(ServiceFactory factory) {
        Service s = factory.getSerive();
        s.methodA();
        s.methodB();
        return s;
    }
}
