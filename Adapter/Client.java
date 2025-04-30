public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new ConcreteAdapter(adaptee);
        adapter.operation();
    }
}