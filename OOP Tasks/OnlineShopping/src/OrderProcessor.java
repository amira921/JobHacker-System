public class OrderProcessor{
    public OrderProcessor(){
    }
    public void placeOrder(ShoppingCart cart){
        cart.printItems();
        cart.calculateTotalCost();
    }
}
