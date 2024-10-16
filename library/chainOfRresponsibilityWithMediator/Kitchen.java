package chainOfRresponsibilityWithMediator;

public class Kitchen {
    private Mediator mediator;

    public Kitchen(Mediator mediator) {
        this.mediator = mediator;
    }

    public void prepareOrder() {
        System.out.println("Kitchen prepares the order.");
    }
}