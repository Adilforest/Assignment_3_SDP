package chainOfRresponsibilityWithCommand;

public class SushiOrder implements Command {
    private SushiChef sushiChef;

    public SushiOrder(SushiChef sushiChef) {
        this.sushiChef = sushiChef;
    }

    @Override
    public void execute() {
        sushiChef.prepareSushi();
    }
}
