import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class itemTest {

    Item item;

    //The one where the item class is created

    @Before
    public void before() {

        item = new Item("speakers", 10, 10.00);
    }

    //The one where the name of the item can be returned

    @Test
    public void canGetName(){

        assertEquals("speakers" , item.getName());
    }

    //The one where the quantity of the item can be returned.
    @Test
    public void canGetQuantity(){

        assertEquals(10, item.getQuantity());
    }

    //The one where the price of the items is returned
    @Test
    public void canGetPrice(){

        assertEquals(10.00, item.getPrice(),0.01);
    }

    //The one where the total order price can be returned.
    @Test
    public void canGetTotal(){

        assertEquals(100.00, item.getTotal(), 0.01);
    }

    //The one where bogof can be applied to items
    @Test
    public void buyOneGetOneFree(){

        item.buyOneGetOneFree();
        assertEquals(50.00, item.total,0.01);

    }

    //The one where a 2% discount is added after all other discounts
    @Test
    public void loyaltyCardDiscount() {


    }

}
