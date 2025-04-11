import java.util.ArrayList;
import java.util.List;

public class Model implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String modelData;

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    public String getData() {
        return modelData;
    }

    public void setData(String newData) {
        this.modelData = newData;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}