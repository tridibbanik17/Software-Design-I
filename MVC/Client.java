public class Client {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model);

        controller.changeData("New Data 1");
        controller.changeData("New Data 2");
    }
}