package chainOfRresponsibilityWithMediator;

public class Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen(null);
        Waiter waiter = new Waiter(null);

        OrderMediator mediator = new OrderMediator(kitchen, waiter);

        kitchen = new Kitchen(mediator);
        waiter = new Waiter(mediator);

        waiter.takeOrder();
    }
}