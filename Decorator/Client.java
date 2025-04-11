public class Client {
    public static void main(String[] args) {
        Component base = new ConcreteComponent();
        Decorator decorated = new ConcreteDecorator(base);

        decorated.operation();
    }
}