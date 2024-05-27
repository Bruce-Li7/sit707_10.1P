package sit707_task10;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	List<Task> inbox;

    public TaskManager() {
        this.inbox = new ArrayList<>();
    }

    public void submitTask(String name, String studentId, String email, String comment) {
        Task task = new Task(name, studentId, email, comment);
        this.inbox.add(task);
    }
   
    public void listTasks() {
        for (Task task : this.inbox) {
            System.out.println("Task name: " + task.name + ", ID: " + task.studentId + ", Email: " + task.email + ", Comment: " + task.comment);
        }
    }
	
	
}
