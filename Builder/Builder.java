/* Declare methods (without implementation) to build parts of a Product */
public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}