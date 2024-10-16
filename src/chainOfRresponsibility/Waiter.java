package chainOfRresponsibility;


public class Waiter extends OrderHandler {
    public Waiter() {
        this.handlerPriority = 3;
    }

    @Override
    public void handleOrder(String orderType, int orderPriority) {
        if (orderPriority <= this.handlerPriority && orderType.equalsIgnoreCase("drink")) {
        } else {
            if (nextHandler != null) {
                nextHandler.handleOrder(orderType, orderPriority);
            }
        }
    }
}