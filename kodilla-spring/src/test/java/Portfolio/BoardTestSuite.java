package Portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes ={BoardConfig.class})
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Task1");
        board.getInProgressList().addTask("Task2");
        board.getDoneList().addTask("Task3");

        //When
        String result1 = board.getToDoList().getTasks(0);
        String result2 = board.getInProgressList().getTasks(0);
        String result3 = board.getDoneList().getTasks(0);

        //When
        Assert.assertEquals("Task1", result1);
        Assert.assertEquals("Task2", result2);
        Assert.assertEquals("Task3", result3);


    }
}
