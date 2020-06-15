package Calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={Display.class})

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("Calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultt1 = calculator.add(2,2);
        double resultt2 = calculator.sub(3, 2);
        double resultt3 = calculator.mul(2, 2);
        double resultt4 = calculator.div(3,3);
        //Then
        Assert.assertEquals(resultt1, 4, 0.1);
        Assert.assertEquals(resultt2, 1, 0.1);
        Assert.assertEquals(resultt3, 4, 0.1);
        Assert.assertEquals(resultt4, 1, 0.1);

    }
}
