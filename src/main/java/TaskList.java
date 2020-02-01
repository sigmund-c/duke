import java.util.ArrayList;
import java.util.List;

/**
 * Basically a list of Tasks
 */
public class TaskList {
    List<Task> tasks;

    /**
     * Creates a TaskList, which is basically a list of Tasks
     */
    public TaskList() {
        tasks = new ArrayList<>();
    }

    /**
     * Creates a TaskList, which is basically a list of Tasks
     * @param tasks a list of Tasks to convert
     */
    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * get an item from the list with the specified index
     * @param index index of the object to return
     * @return object with the specified index
     */
    public Task get(int index) {
        return tasks.get(index);
    }

    /**
     * Returns the size of the list
     * @return size of the list
     */
    public int size() {
        return tasks.size();
    }

    /**
     * Adds a task to end of the list
     * @param task the task to add
     */
    public void add(Task task) {
        tasks.add(task);
    }

    /**
     * Deletes a Task from the list with the specified index
     * @param index index of Task to remove
     * @return removed Task
     */
    public Task delete(int index) {
        return tasks.remove(index);
    }

    /**
     * Marks a task as done
     * @param index the task to mark as done
     */
    public void done(int index) {
        tasks.get(index).markAsDone();
    }

    @Override
    public String toString() {
        String toReturn = "\n";

        int listNo = 1;
        for (Task task : tasks) {
            toReturn += listNo + " ";
            toReturn += task + "\n";

            listNo++;
        }
        return toReturn;
    }
}
