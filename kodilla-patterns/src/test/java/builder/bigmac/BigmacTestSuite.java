package builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Lettuce")
                .bun("Wheat")
                .sauce("Hot")
                .burgersQuantity(3)
                .ingredient("Tomato")
                .ingredient("Egg")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgersQuantity();
        String whichBun = bigmac.getBun();
        String whichSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("Wheat", whichBun);
        Assert.assertEquals("Hot", whichSauce);

    }
}
