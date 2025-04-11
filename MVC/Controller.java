public class Controller {
    private final Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void changeData(String newData) {
        model.setData(newData);
    }
}