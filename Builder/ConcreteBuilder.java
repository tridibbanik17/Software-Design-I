/* Assemble and return the final product */
public class ConcreteBuilder implements Builder {
    private final Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("Engine");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Wheels");
    }

    @Override
    public Product getResult() {
        return product;
    }
}