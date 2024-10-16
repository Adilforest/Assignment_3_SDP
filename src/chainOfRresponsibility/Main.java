package chainOfRresponsibility;

public class Main {
    public static void main(String[] args) {
        Hall hall = new Hall();

        hall.takeOrder("hot dish");
        hall.takeOrder("sushi");
        hall.takeOrder("drink");
    }
}