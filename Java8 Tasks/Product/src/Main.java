public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        // exercise 1
        System.out.println(product.getBookCategory());

        // exercise 2
        System.out.println(product.getBooksWithPriceLessThan100());

        // exercise 3
        System.out.println(product.getToyCategory());

        // exercise 4
        System.out.println(product.getCheapestBook());
    }
}