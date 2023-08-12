public class Main {
    public static void main(String[] args) {
        // Add Products
        Product product1 = new Product("Shoes",60); // change productPrice to positive number to the make the system works.
        Product product2 = new Product(null,1000.6); // change productName to string to the make the system works.
        Product product3 = new Product("Dress",1000.33);
        Product product4 = new Product("Trousers",1000.5);

        // Add Products to Shopping Cart
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(product1);
        cart1.addItem(product4);

        // Display Total Cost
        cart1.calculateTotalCost();

        // Print Order
        OrderProcessor order = new OrderProcessor();
        order.placeOrder(cart1);
    }
}