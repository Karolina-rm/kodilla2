package strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User anna = new Millenials("AnnaM");
        User monika = new YGeneration("MonikaS");
        User gosia = new ZGeneration("GosiaT");

        //When
        String annaUse = anna.sharePost();
        System.out.println(annaUse + " " + anna.getUserName());
        String monikaUse = monika.sharePost();
        System.out.println(monikaUse + " " + monika.getUserName());
        String gosiaUse = gosia.sharePost();
        System.out.println(gosiaUse + " " + gosia.getUserName());

        //Then
        Assert.assertEquals("We use Facebook!", annaUse);
        Assert.assertEquals("We use Twitter!", monikaUse);
        Assert.assertEquals("We use Snapchat!", gosiaUse);


    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User anna = new Millenials("AnnaM");
        //When
        String annaUse = anna.sharePost();
        System.out.println(annaUse + " " + anna.getUserName());
        anna.setSocialPublisher(new SnapchatPublisher());
        annaUse = anna.sharePost();
        System.out.println("Now, " + annaUse + " " + anna.getUserName());
        //Then
        Assert.assertEquals("We use Snapchat!", annaUse);



    }
}
