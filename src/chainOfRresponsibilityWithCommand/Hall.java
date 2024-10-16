package chainOfRresponsibilityWithCommand;


public class Hall {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void placeOrder() {
        command.execute();
    }
}