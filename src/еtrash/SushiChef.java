package еtrash;

import chainOfRresponsibility.OrderHandler;

public class SushiChef extends OrderHandler {
    public SushiChef() {
        this.handlerPriority = 2; // Второй приоритет
    }

    @Override
    public void handleOrder(String orderType, int orderPriority) {
        if (orderPriority <= this.handlerPriority && orderType.equalsIgnoreCase("sushi")) {
            System.out.println("Sushi chef prepares sushi.");
        } else {
            if (nextHandler != null) {
                nextHandler.handleOrder(orderType, orderPriority);
            }
        }
    }
}
