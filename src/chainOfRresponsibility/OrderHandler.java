package chainOfRresponsibility;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;
    protected int handlerPriority;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleOrder(String orderType, int orderPriority);
}