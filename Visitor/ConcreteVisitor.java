public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting Element A");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting Element B");
        elementB.operationB();
    }
}
