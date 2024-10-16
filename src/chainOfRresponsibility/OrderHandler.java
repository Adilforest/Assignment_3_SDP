package chainOfRresponsibility;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;
    protected int handlerPriority; // Поле для приоритета

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Метод для обработки заказа, который будет реализован в подклассах
    public abstract void handleOrder(String orderType, int orderPriority);
}