import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    ArrayList <Item>items;
    Item item, item1, item2;
    Basket basket;

    @Before
    public  void before(){

        ArrayList items = new ArrayList<>();
        item = new Item ("Speakers", 6, 10.00);
        item1 = new Item ("Book", 1, 40.00);
        item2 = new Item ("Xbox Game", 4, 30.00);

        basket = new Basket ();

        basket.addItems(item);
        basket.addItems(item1);
        basket.addItems(item2);
    }
    //The one where an item is added to the basket.
    @Test
    public void canAddItem(){

        basket.addItems(item);
        assertEquals(1, basket.numberOfItems());
    }
    //The one where an item is removed from the basket.
    @Test
    public void canRemoveItem(){
        basket.addItems(item);
        basket.removeItem(item);
        assertEquals(0, basket.numberOfItems());
    }
    //The one where the basket is emptied.
    @Test
    public void canRemoveAllItems(){

        basket.clearBasket();
        assertEquals(0, basket.numberOfItems());

    }
    //The one where total price of items in basket is calculated.
    @Test
    public void CanGetTotalPriceOfItemsInBasket(){

        assertEquals(190.00, basket.getBasketTotal(),0.01);

    }
    //The one were a 10% discount can be applied to all baskets over £20.00
    @Test
    public void canGetOverTwentyDiscount(){
        basket.getBasketTotal();
        basket.tenPercentDiscount();
        assertEquals(171, basket.totalCost,0.01);
    }

    //The one where you have a loyalty card
    @Test
    public void hasLoyaltyCard(){
        Basket basket1 = new Basket();
        item.buyOneGetOneFree();
        basket1.addItems(item);
        basket1.getBasketTotal();
        basket1.tenPercentDiscount();
        basket1.loyaltyCard();
        assertEquals(26.46, basket1.totalCost, 0.01);

    }

}
