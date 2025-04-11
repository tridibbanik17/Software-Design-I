public class View implements Observer {
    private final Model model;

    public View(Model model) {
        this.model = model;
        model.attach(this);
    }

    public void display() {
        System.out.println("The new data is " + model.getData());
    }

    @Override
    public void update() {
        display();
    }
}