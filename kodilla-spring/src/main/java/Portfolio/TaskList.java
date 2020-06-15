package Portfolio;

import java.util.ArrayList;
import java.util.List;


public class TaskList {

    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public String getTasks(int index) {
        return tasks.get(index);
    }
}
