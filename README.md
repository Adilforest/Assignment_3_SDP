# Software Design Patterns — Assignment 3 (AITU)

![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)

## Overview

This assignment explores three **behavioral** design patterns through a shared restaurant-order domain, plus a separate **Iterator** example. Each module builds on the previous one: a plain Chain of Responsibility is first implemented, then the same scenario is refactored to incorporate the Command pattern, and again to incorporate the Mediator pattern. The repository lives under `src/` (runnable modules) and `library/` (supplementary implementations).

## Patterns / Concepts Implemented

- **Chain of Responsibility** (`src/chainOfRresponsibility`) — an abstract `OrderHandler` holds a reference to the next handler; concrete handlers `Chef`, `SushiChef`, `Barman`, and `Waiter` each decide whether to process an order type (matched by string and priority) or forward it down the chain. The chain is assembled in `Hall`.

- **Command** (`src/chainOfRresponsibilityWithCommand`) — a `Command` interface with a single `execute()` method; three concrete commands (`HotDishOrder`, `SushiOrder`, `DrinkOrder`) encapsulate a receiver and its action. `Hall` acts as the invoker: it holds a `Command` reference and calls `placeOrder()`, decoupling the caller from the receiver.

- **Mediator** (`library/chainOfRresponsibilityWithMediator`) — a `Mediator` interface defines `notify(sender, event)`; `OrderMediator` coordinates `Kitchen` and `Waiter` so neither class references the other directly. When `Waiter.takeOrder()` fires, it notifies the mediator, which routes to `Kitchen.prepareOrder()`.

- **Iterator** (`library/Iterator`) — a custom `TaskIterator` interface (`hasNext()` / `next()`) is implemented by a private inner class `TaskListIterator` inside `TaskCollection`, which wraps an `ArrayList<Task>`. Demonstrates sequential traversal without exposing the underlying list.

- **Inheritance and abstract classes** — `OrderHandler` (Chain of Responsibility) is an abstract class with a protected `nextHandler` field and an abstract `handleOrder` method, showing template-method-style skeleton plus concrete subclass specialization.

- **Interface-based polymorphism** — both `Command` and `Mediator` are interfaces; concrete classes are substituted at runtime, keeping each module open for extension.

## Project Structure

```
Assignment_3_SDP/
├── src/
│   ├── chainOfRresponsibility/
│   │   ├── OrderHandler.java       # abstract handler (base of the chain)
│   │   ├── Chef.java
│   │   ├── SushiChef.java
│   │   ├── Barman.java
│   │   ├── Waiter.java
│   │   ├── Hall.java               # assembles and starts the chain
│   │   └── Main.java
│   ├── chainOfRresponsibilityWithCommand/
│   │   ├── Command.java            # command interface
│   │   ├── HotDishOrder.java
│   │   ├── SushiOrder.java
│   │   ├── DrinkOrder.java
│   │   ├── Chef.java / SushiChef.java / Barman.java   # receivers
│   │   ├── Hall.java               # invoker
│   │   └── Main.java
│   └── Main.java                   # IntelliJ project default entry point
└── library/
    ├── chainOfRresponsibilityWithMediator/
    │   ├── Mediator.java           # mediator interface
    │   ├── OrderMediator.java      # concrete mediator
    │   ├── Kitchen.java
    │   ├── Waiter.java
    │   └── Main.java
    └── Iterator/
        ├── TaskIterator.java       # iterator interface
        ├── TaskCollection.java     # aggregate + private inner iterator
        ├── Task.java
        └── Main.java
```

## How to Run

The project has no build tool; compile and run each module with `javac`/`java` from the repo root, or open the project in IntelliJ IDEA (JDK 21) and run the desired `Main` class directly.

**Chain of Responsibility**
```bash
javac -d out src/chainOfRresponsibility/*.java
java -cp out chainOfRresponsibility.Main
```

**Chain of Responsibility + Command**
```bash
javac -d out src/chainOfRresponsibilityWithCommand/*.java
java -cp out chainOfRresponsibilityWithCommand.Main
```

**Mediator**
```bash
javac -d out library/chainOfRresponsibilityWithMediator/*.java
java -cp out chainOfRresponsibilityWithMediator.Main
```

**Iterator**
```bash
javac -d out library/Iterator/*.java
java -cp out Iterator.Main
```

---

Adil Ormanov — [GitHub](https://github.com/Adilforest)
