public class Item {

    String name;
    int quantity;
    double price;
    double total;

    public Item (String name, int quantity, double price){

        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = price * quantity;

    }

    /**
     *
     * @return String - name of product
     */
    public String getName(){
        return this.name;

    }

    /**
     *
     * @return int - quantity of items
     */
    public int getQuantity(){

        return this.quantity;
    }

    /**
     *
     * @return double - price of individual item
     */
    public double getPrice(){

        return this.price;
    }

    /**
     *
     * @return double - total price of all items: price * quantity
     */

    public double getTotal(){

        return this.total;
    }

    public void buyOneGetOneFree(){

        if (quantity > 1){
        double discount = this.total/2;
        this.total = discount;

        }

    }
}


