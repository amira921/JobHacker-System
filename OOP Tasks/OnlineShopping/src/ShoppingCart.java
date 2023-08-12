import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> cart;
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    protected void addItem(Product product){
        cart.add(product);
    }
    protected void removeItem(Product product){
        cart.remove(product);
    }
    protected void retrieveItem(){


    }
    protected void calculateTotalCost(){
        float totalCost = 0;
        for (Product p: cart) totalCost += p.getProductPrice();
        System.out.println("The Total Cost is " + totalCost);

    }
    protected void printItems(){
        System.out.println("The Order: ");
        for(Product c:cart)
            System.out.println("product name: " + c.getProductName() + " price: " + c.getProductPrice());
    }
}
