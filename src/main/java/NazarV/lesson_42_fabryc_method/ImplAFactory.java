package NazarV.lesson_42_fabryc_method;

public class ImplAFactory implements ServiceFactory{
    public Service getSerive() {
        return new ImplementationA();
    }
}
