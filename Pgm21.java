/*
create a class product(product_name,stock_quantity).
implement a method purchase(int quantity):
if the requested quantity is less than or equal to zero,throw a built-in illegalargumentexception with the message "Quantity must be positive."
if the requested quantity is greater than stock_quantity,throw a customoutofstockexception.
*/
import java.util.Scanner;
class CustomOutOfStockException extends Exception {
    public CustomOutOfStockException(String message) {
        super(message);
    }
}

class Product {
    private String productName;
    private int stockQuantity;

    public Product(String productName, int stockQuantity) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
    }

    public void purchase(int quantity) throws CustomOutOfStockException {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
        if (quantity > stockQuantity) {
            throw new CustomOutOfStockException("Not enough stock available.");
        }
        stockQuantity -= quantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getProductName() {
        return productName;
    }
}

public class Pgm21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter stock quantity: ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        int stock = scanner.nextInt();
        Product product = new Product(name, stock);
        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();
        try {
            product.purchase(quantity);  
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }        
        catch (CustomOutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}