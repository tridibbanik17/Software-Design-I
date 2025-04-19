
public class Caller {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void callCommand() {
        command.execute();
    }
}

