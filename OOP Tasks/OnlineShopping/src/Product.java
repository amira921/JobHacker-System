public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        try{
            if (productPrice < 0) throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println("Product Price cannot be less than 0");
            System.exit(0);
        }
        try{
            if (productName.isEmpty() || productName == null) throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println("Product Name can't be empty or null");
            System.exit(0);
        }
        if (!productName.isEmpty() && productName != null) this.productName = productName;
        if(productPrice > 0) this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
}
