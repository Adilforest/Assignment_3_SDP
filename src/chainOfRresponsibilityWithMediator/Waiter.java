package chainOfRresponsibilityWithMediator;

public class Waiter {
    private Mediator mediator;

    public Waiter(Mediator mediator) {
        this.mediator = mediator;
    }

    public void takeOrder() {
        System.out.println("Waiter takes the order.");
        mediator.notify(this, "order");
    }
}