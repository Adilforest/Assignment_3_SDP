package chainOfRresponsibilityWithCommand;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        SushiChef sushiChef = new SushiChef();
        Barman barman = new Barman();

        Command hotDishOrder = new HotDishOrder(chef);
        Command sushiOrder = new SushiOrder(sushiChef);
        Command drinkOrder = new DrinkOrder(barman);

        Hall hall = new Hall();

        hall.setCommand(hotDishOrder);
        hall.placeOrder();

        hall.setCommand(sushiOrder);
        hall.placeOrder();

        hall.setCommand(drinkOrder);
        hall.placeOrder();
    }
}
