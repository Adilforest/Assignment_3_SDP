package chainOfRresponsibility;


public class Barman extends OrderHandler {
    public Barman() {
        this.handlerPriority = 3;
    }

    @Override
    public void handleOrder(String orderType, int orderPriority) {
        if (orderPriority <= this.handlerPriority && orderType.equalsIgnoreCase("drink")) {
            System.out.println("Barman makes the drink.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleOrder(orderType, orderPriority);
            }
        }
    }
}