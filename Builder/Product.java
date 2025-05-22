/* Represent the complex object being built.
   Hold data assembled by the builder */
public class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void show() {
        System.out.println("Product with: " + partA + " and " + partB);
    }
}