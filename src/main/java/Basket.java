import java.util.ArrayList;

public class Basket {

    ArrayList<Item> items;
    double discount;
    double totalCost;

    public Basket() {

        this.items = new ArrayList<>();
    }

    public void addItems(Item item) {

        this.items.add(item);

    }

    public void removeItem(Item item) {

        this.items.remove(item);
    }

    public int numberOfItems() {

        return items.size();
    }

    public void clearBasket() {

        this.items.clear();
    }

    //find out how to do alternative for loop
    public double getBasketTotal() {


        for (int i = 0; i < items.size(); i++) {

            Item result = items.get(i);
            totalCost += result.total;

        }
        return totalCost;
    }

    public void tenPercentDiscount(){

        if (totalCost > 20.00){

            totalCost = totalCost * 0.9;
        }
    }

    public void loyaltyCard(){

        double discount = totalCost * 0.02;
        totalCost = totalCost - discount;


    }

}
