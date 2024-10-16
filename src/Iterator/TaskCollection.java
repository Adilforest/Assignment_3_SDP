package Iterator;

import java.util.ArrayList;
import java.util.List;

public class TaskCollection {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public TaskIterator createIterator() {
        return new TaskListIterator();
    }

    private class TaskListIterator implements TaskIterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < tasks.size();
        }

        @Override
        public Task next() {
            return tasks.get(index++);
        }
    }
}