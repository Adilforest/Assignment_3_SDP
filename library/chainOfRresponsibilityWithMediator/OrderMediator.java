package chainOfRresponsibilityWithMediator;

public class OrderMediator implements Mediator {
    private Kitchen kitchen;
    private Waiter waiter;

    public OrderMediator(Kitchen kitchen, Waiter waiter) {
        this.kitchen = kitchen;
        this.waiter = waiter;
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender.equals(waiter) && event.equals("order")) {
            kitchen.prepareOrder();
        }
    }
}
