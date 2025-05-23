public class ConcreteObserver implements Observer {
    private String observerState;

    public ConcreteObserver() {
        this.observerState = "";
    }

    @Override
    public void update(String newState) {
        this.observerState = newState;
        System.out.println("Observer updated to: " + observerState);
    }
}