//Product class representing any item in eCommerce

import java.util.*;

class Product{
    public String name;
    public double price;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }
}
//1.ShoppingCart : Only responsible for Cart realated business logic
class ShoppingCart{
    private List<Product> products = new ArrayList<>();//to store products
    //getter and setters
    public void addProduct(Product p){
        products.add(p);
    }

      public final List<Product> getProducts(){
        return products;
    }

    //1.Calculates total price in cart
    public double calculateTotal(){
        double total = 0;
        for(Product p:products){
            total += p.price;
        }
        return total;
    }

}
//2.ShoppingCartPrinter : Only responsible for printing invoices
class ShoppingCartPrinter{
    private final ShoppingCart shoppingCart;

    public ShoppingCartPrinter(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }

    public void printInvoice(){
        System.out.println("Shopping Cart Invoice : ");
        for(Product p : shoppingCart.getProducts()){
            System.out.println(p.name + " - $" + p.price);
        }
        System.out.println("Total : $ " + shoppingCart.calculateTotal());
    }
}

class ShoppingCartStorage{
    private ShoppingCart shoppingCart;
    public ShoppingCartStorage(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }

    public void saveToDatabase(){
        System.out.println("Saving shopping cart to database...");
    }
}
public class SRP_Followed {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Laptop", 1500));
        shoppingCart.addProduct(new Product("Mouse", 50));

        ShoppingCartPrinter shoppingCartPrinter = new ShoppingCartPrinter(shoppingCart);
        shoppingCartPrinter.printInvoice();

        ShoppingCartStorage storage = new ShoppingCartStorage(shoppingCart);
        storage.saveToDatabase();
    }
}
