package IthIterator;

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