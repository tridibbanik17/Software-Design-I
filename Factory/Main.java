public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.performAction(); // Output: ConcreteProductA is performing an action.

        Product productB = ProductFactory.createProduct("B");
        productB.performAction(); // Output: ConcreteProductB is performing an action.
    }
}
