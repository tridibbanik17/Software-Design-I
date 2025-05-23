public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("Initial State");

        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.attach(observer1);
        subject.attach(observer2);
        subject.detach(observer1);

        subject.setState("New State");
    }
}