# Assignment 3: Software Design Patterns

This repository contains implementations of various software design patterns as part of the assignments for the Software Design Patterns course.

## Project Structure

The project is organized into the following packages:

- `chainOfResponsibility`: Contains the implementation of the Chain of Responsibility pattern.
- `chainOfResponsibilityWithCommand`: Contains the implementation of the Command pattern using the Chain of Responsibility structure.
- `chainOfResponsibilityWithMediator`: Contains the implementation of the Mediator pattern using the Chain of Responsibility structure.
- `Iterator`: Contains the implementation of the Iterator pattern to traverse a list of tasks.
- `etrash`: Contains obsolete classes that are not used in the current implementations.

## Design Patterns Implemented

### 1. Chain of Responsibility Pattern
The Chain of Responsibility pattern allows an object to pass a request along a chain of handlers. Each handler can either process the request or pass it to the next handler in the chain.

### 2. Command Pattern
The Command pattern encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

### 3. Mediator Pattern
The Mediator pattern defines an object that encapsulates how a set of objects interact. This promotes loose coupling by keeping objects from referring to each other explicitly.

### 4. Iterator Pattern
The Iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying representation.

## Usage

To run the examples, compile the classes in each package and run the `Main` class within the respective package.

### Example for Iterator Pattern

```java
public class Main {
    public static void main(String[] args) {
        TaskCollection taskCollection = new TaskCollection();
        taskCollection.addTask(new Task("Order food"));
        taskCollection.addTask(new Task("Serve food"));
        taskCollection.addTask(new Task("Take payment"));

        TaskIterator iterator = taskCollection.createIterator();

        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println("Executing task: " + task.getTaskName());
        }
    }
}
