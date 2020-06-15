package factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        // When
        Task drivingTask = taskFactory.doTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Going",drivingTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        // When
        Task paintingTask = taskFactory.doTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Drawing",paintingTask.getTaskName());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        // When
        Task shoppingTask = taskFactory.doTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Buying",shoppingTask.getTaskName());
    }
}
