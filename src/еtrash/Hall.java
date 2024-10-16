package еtrash;

import chainOfRresponsibility.Barman;
import chainOfRresponsibility.Chef;
import chainOfRresponsibility.OrderHandler;
import chainOfRresponsibility.SushiChef;

public class Hall {
    private OrderHandler handler;

    public Hall() {
        // Создание цепочки обработчиков
        chainOfRresponsibility.Chef chef = new Chef();
        chainOfRresponsibility.SushiChef sushiChef = new SushiChef();
        chainOfRresponsibility.Barman barman = new Barman();

        // Установка цепочки с учётом приоритетов
        chef.setNextHandler(sushiChef);
        sushiChef.setNextHandler(barman);

        handler = chef;  // Цепь начинается с повара
    }

    public void takeOrder(String orderType) {
        int orderPriority;

        switch (orderType.toLowerCase()) {
            case "hot dish":
                orderPriority = 1;
                break;
            case "sushi":
                orderPriority = 2;
                break;
            case "drink":
                orderPriority = 3;
                break;
            default:
                System.out.println("Unknown order type.");
                return;
        }

        handler.handleOrder(orderType, orderPriority);
    }
}