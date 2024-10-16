package chainOfRresponsibilityWithCommand;


public class DrinkOrder implements Command {
    private Barman barman;

    public DrinkOrder(Barman barman) {
        this.barman = barman;
    }

    @Override
    public void execute() {
        barman.makeDrink();
    }
}