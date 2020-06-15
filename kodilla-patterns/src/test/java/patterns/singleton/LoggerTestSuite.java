package patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        String log = "New log";
        //When
        Logger.getInstance().log(log);
        //Then
        Assert.assertEquals(log, Logger.getInstance().getLastLog());
    }
}
