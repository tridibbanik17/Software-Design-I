import java.util.ArrayList;
import java.util.List;
public class ConcreteSubject implements Subject {
    private String subjectState;
    private final List<Observer> observers = new ArrayList<>();

    public ConcreteSubject(String state) {
        this.subjectState = state;
    }

    public void setState(String newState) {
        this.subjectState = newState;
        notifyObservers();
    }

    public String getState() {
        return subjectState;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(subjectState);
        }
    }
}