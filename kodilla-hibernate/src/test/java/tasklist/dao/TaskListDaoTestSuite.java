package tasklist.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "Test: Practice Hibernate";
    private static final String NAME1 = "Test 1";
    private static final String NAME2 = "Test 2";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList1 = new TaskList(LISTNAME, NAME1);
        TaskList taskList2 = new TaskList(LISTNAME, NAME2);

        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        Assert.assertEquals(2, readTaskList.size());

        //CleanUp
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);

    }
}
