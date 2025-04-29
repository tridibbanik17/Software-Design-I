public class Client {
    public static void main(String[] args) {
        Element[] elements = { new ConcreteElementA(), new ConcreteElementB() };
        Visitor visitor = new ConcreteVisitor();

        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
