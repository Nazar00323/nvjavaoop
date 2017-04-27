package NazarV.lesson_42_fabryc_method;

public class ImplBFactory implements ServiceFactory {
    public Service getSerive() {
        return new ImplementationB();
    }
}
