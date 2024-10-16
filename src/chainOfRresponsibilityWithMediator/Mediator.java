package chainOfRresponsibilityWithMediator;

public interface Mediator {
    void notify(Object sender, String event);
}