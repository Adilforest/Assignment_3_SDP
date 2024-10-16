package chainOfRresponsibility;

public class Chef extends OrderHandler {
    public Chef() {
        this.handlerPriority = 1;
    }

    @Override
    public void handleOrder(String orderType, int orderPriority) {
        if (orderPriority <= this.handlerPriority && orderType.equalsIgnoreCase("hot dish")) {
            System.out.println("Chef prepares the hot dish.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleOrder(orderType, orderPriority);
            }
        }
    }
}