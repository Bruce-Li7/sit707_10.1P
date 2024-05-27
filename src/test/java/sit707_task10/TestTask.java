package sit707_task10;

import org.junit.Assert;
import org.junit.Test;

public class TestTask {
	@Test
    public void testSubmitTask() {
        // create a taskmanager
        TaskManager taskManager = new TaskManager();

        // submit a task
        taskManager.submitTask("Task1.1", "221105067", "ohg@deakin.edu.au", "This is my task1.1 task.");

        // check task added to inbox.
        Assert.assertEquals(1, taskManager.inbox.size());

        // check task details
        Task task = taskManager.inbox.get(0);
        Assert.assertEquals("Task1.1", task.name);
        Assert.assertEquals("221105067", task.studentId);
        Assert.assertEquals("ohg@deakin.edu.au", task.email);
        Assert.assertEquals("This is my task1.1 task.", task.comment);
    }
}