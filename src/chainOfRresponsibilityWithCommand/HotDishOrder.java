package chainOfRresponsibilityWithCommand;

public class HotDishOrder implements Command {
    private Chef chef;

    public HotDishOrder(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.prepareHotDish();
    }
}