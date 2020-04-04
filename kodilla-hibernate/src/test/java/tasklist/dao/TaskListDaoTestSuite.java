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

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, NAME1);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readLists.size());

        //CleanUp
        int idToRemove = readLists.get(0).getId();
        taskListDao.deleteById(idToRemove);

    }
    }

